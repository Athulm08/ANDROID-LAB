package com.example.myintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    EditText nameInput;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        nameInput = findViewById(R.id.editTextName);
        sendButton = findViewById(R.id.buttonSend);

        sendButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString();
            Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
            intent.putExtra("user_name", name);
            startActivity(intent);
        });
    }
}

