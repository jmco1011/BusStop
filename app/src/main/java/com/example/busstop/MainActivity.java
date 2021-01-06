package com.example.busstop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtUsername, txtPassword, txtFpassword,txtRegister;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        txtFpassword = findViewById(R.id.txtFpassword);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtRegister = findViewById(R.id.txtRegister);

        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(MainActivity.this, RegistrationForm.class);
                MainActivity.this.startActivity(myintent);
            }
        });

        txtFpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(MainActivity.this, ForgotPasswordForm.class);
                MainActivity.this.startActivity(myintent);
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsername.getText().toString().isEmpty()|| txtPassword.getText().toString().isEmpty()){

                    Toast.makeText(getApplicationContext(), "details empty",Toast.LENGTH_SHORT).show();
                }else {
                    Intent myintent = new Intent(MainActivity.this, MainPage.class);
                    MainActivity.this.startActivity(myintent);
                }
            }
        });


    }
}