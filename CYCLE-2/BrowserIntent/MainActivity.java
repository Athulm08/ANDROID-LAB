package com.example.browserintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOpenBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenBrowser = findViewById(R.id.btnOpenBrowser);

        btnOpenBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // URL to open
                String url = "https://www.google.com";

                // Create an implicit intent
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Start browser activity
                startActivity(intent);
            }
        });
    }
}
