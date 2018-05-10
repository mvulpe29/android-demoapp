package mita.demo_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("Job")
    Call<List<Job>> getJobs();

    @GET("Job/{id}")
    Call<Job> getJobDetails(@Path("id") String id);
}