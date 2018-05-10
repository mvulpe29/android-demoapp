package mita.demo_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JobDetailActivity extends AppCompatActivity {

    private static final String TAG = "JobDetailActivity";

    private DatabaseReference mDatabase;

    Job currentJob;

    @BindView(R.id.jobID) TextView idTextView;
    @BindView(R.id.jobFrom) TextView fromTextView;
    @BindView(R.id.jobTo) TextView toTextView;
    @BindView(R.id.jobStatus) TextView statusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_detail);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        String jobID = intent.getStringExtra("jobID");

//        DatabaseReference mJobReference = FirebaseDatabase.getInstance().getReference("jobs").child(jobID);
//
//        ValueEventListener jobListener = new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // Get Post object and use the values to update the UI
//                currentJob = dataSnapshot.getValue(Job.class);
//                idTextView.setText(currentJob.getId());
//                fromTextView.setText(currentJob.getFrom());
//                toTextView.setText(currentJob.getTo());
//                statusTextView.setText(currentJob.getStatus());
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                // Getting Post failed, log a message
//                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
//                // ...
//            }
//        };
//        mJobReference.addValueEventListener(jobListener);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<Job> call = apiService.getJobDetails(jobID);
        call.enqueue(new Callback<Job>() {
            @Override
            public void onResponse(Call<Job>call, Response<Job> response) {
                currentJob = response.body();
                idTextView.setText(currentJob.getId());
                fromTextView.setText(currentJob.getFrom());
                toTextView.setText(currentJob.getTo());
                statusTextView.setText(currentJob.getStatus());
            }

            @Override
            public void onFailure(Call<Job>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });

    }


}
