package com.example.intentnavigationapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnNavigate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the button
        btnNavigate = findViewById(R.id.btnNavigate);

        // Set click listener for the button
        btnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create Intent to navigate to SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Optional: Pass data to the second activity
                intent.putExtra("message", "Hello from Main Activity!");
                intent.putExtra("user_name", "John Doe");

                // Start the second activity
                startActivity(intent);
            }
        });
    }
}

