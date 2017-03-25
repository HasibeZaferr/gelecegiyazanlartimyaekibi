package com.hasibezafer.timyanoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etUserName;
    EditText etPassword;
    Button btnSign;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnSign = (Button) findViewById(R.id.btnSign);
        btnSign.setOnClickListener(this);

        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        if(view == btnSign)
        {
            String userName = etUserName.getText().toString();
            String password = etPassword.getText().toString();

            if(userName.equals("Hasibe") && password.equals("123"))
            {
                Intent intent = new Intent(getApplicationContext(),NoteActivity.class);
                intent.putExtra("USERNAME",userName);
                startActivity(intent);

            }
            else
            {
                Toast.makeText(getApplicationContext(),"Kullanıcı adı yada parola hatalı",Toast.LENGTH_LONG).show();
            }

        }

        if(view == btnRegister)
        {
            Toast.makeText(getApplicationContext(),"Kayıt işlemi şu an aktif değil!",Toast.LENGTH_LONG).show();

        }


    }
}
