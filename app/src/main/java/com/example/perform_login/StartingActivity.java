package com.example.perform_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingActivity extends AppCompatActivity {

    private Button mBtnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getting_started_layout);
        mBtnstart = findViewById(R.id.btnstart);
        mBtnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getStarted = new Intent(StartingActivity.this, LoginActivity.class);
                startActivity(getStarted);
            }
        });
    }
}