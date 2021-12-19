package com.example.intent_task;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EXPLICIT extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);
// Bind the components to their respective objects
        // by assigning their IDs
        // with the help of findViewById() method
         btn =  findViewById(R.id.btn5);

        btn.setOnClickListener(view -> {

            // Creating explicit intent
            Intent i = new Intent(getApplicationContext(),
                    next_activity.class);
            startActivity(i);
        });
    }
}