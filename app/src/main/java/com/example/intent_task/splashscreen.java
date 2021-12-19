package com.example.intent_task;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

@SuppressLint("CustomSplashScreen")
public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
    }
        public void btn1Implicit(View view ) {
            Intent intent = new Intent(splashscreen.this,IMPLICIT.class);
            startActivity(intent);
        }
        public void btn2Explicit(View view){
        Intent intent = new Intent(splashscreen.this,EXPLICIT.class);
        startActivity(intent);
        }

    }

