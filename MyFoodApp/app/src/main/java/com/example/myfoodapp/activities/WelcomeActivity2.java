package com.example.myfoodapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myfoodapp.R;

public class WelcomeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);
    }

    public void register(View view) {
        startActivity(new Intent(WelcomeActivity2.this, RegistrationActivity.class));

    }

    public void Login(View view) {
        startActivity(new Intent(WelcomeActivity2.this, LoginActivity.class));


    }
}