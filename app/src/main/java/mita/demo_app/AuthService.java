package mita.demo_app;

import com.google.firebase.auth.FirebaseAuth;

public class AuthService {

    private FirebaseAuth mAuth;

    public AuthService(){
        mAuth = FirebaseAuth.getInstance();
    }


}
