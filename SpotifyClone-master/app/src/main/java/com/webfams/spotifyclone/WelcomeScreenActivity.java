package com.webfams.spotifyclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        findViewById(R.id.signInButton).setOnClickListener(view -> {
            Intent intent = new Intent(WelcomeScreenActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.signUpButton).setOnClickListener(view -> {
            Intent intent = new Intent(WelcomeScreenActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

    }
}