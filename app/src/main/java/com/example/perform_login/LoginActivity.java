package com.example.perform_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText mEtemail;
    private EditText mEtpassword;
    private Button mBtnlogin;
    private String regex = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    private String passwordregex = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        mEtemail = findViewById(R.id.etemail);
        mEtpassword = findViewById(R.id.etpassword);
        mBtnlogin = findViewById(R.id.btnlogin);
        mBtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmailValid() && isPasswordValid()){
                    Intent login = new Intent(LoginActivity.this, HomeActivity.class);
                    login.putExtra("email",mEtemail.getText().toString());
                    startActivity(login);
                }
            }
        });
    }

    private boolean isEmailValid() {
        if (mEtemail.getText().toString().length() >=1 &&
                mEtemail.getText().toString().matches(regex)) {
            return true;
        } else {
            mEtemail.setError("Invalid Email");
            return false;
        }
    }

    private boolean isPasswordValid() {
        if (mEtpassword.getText().toString().length() >= 6 &&
                mEtpassword.getText().toString().matches(passwordregex)) {
            return true;
        } else {
            mEtpassword.setError("Password must be at least 6 characters and alphanumeric");
            return false;
        }
    }
}