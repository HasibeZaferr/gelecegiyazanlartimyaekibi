package com.hasibezafer.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    TextView tvUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tvUserName = (TextView) findViewById(R.id.tvUserName);
        String accountName = getIntent().getStringExtra("USERNAME");
        tvUserName.setText("Hoşgeldiniz " + accountName);
    }
}
