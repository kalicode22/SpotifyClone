package com.webfams.spotifyclone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInputLayout lEmail = findViewById(R.id.loginEmail);
        TextInputLayout lPass = findViewById(R.id.loginPass);
        TextInputLayout lOTP = findViewById(R.id.loginOTP);


        findViewById(R.id.signInButton).setOnClickListener(view -> {
            try {
                String email = lEmail.getEditText().getText().toString();
                String pass = lPass.getEditText().getText().toString();
                String otp = lOTP.getEditText().getText().toString();

                if (email.equals("admin@admin.com") && pass.equals("000000") && otp.equals("6969")) {
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            } catch (Exception e) {
                Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}