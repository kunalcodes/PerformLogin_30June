package com.example.perform_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView mTvemailId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mTvemailId = findViewById(R.id.tvemailid);
        if (getIntent() != null && getIntent().getExtras() != null){
            String emailId = getIntent().getStringExtra("email");
            mTvemailId.setText(emailId);
        }
    }
}