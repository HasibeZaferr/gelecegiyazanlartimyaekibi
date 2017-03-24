package com.hasibezafer.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etName;
    EditText etPassword;
    Button btnSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnSign = (Button) findViewById(R.id.btnSign);
        btnSign.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view == btnSign){
            String userName = etName.getText().toString();
            Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class );
            intent.putExtra("USERNAME", userName);
            startActivity(intent);
        }

    }
}
