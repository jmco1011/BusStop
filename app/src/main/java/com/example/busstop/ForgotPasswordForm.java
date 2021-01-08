package com.example.busstop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPasswordForm extends AppCompatActivity {
    Button btnfBack,btnfSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_form);
        btnfBack = findViewById(R.id.btnfback);
        btnfSubmit = findViewById(R.id.btnfSubmit);

        btnfBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(ForgotPasswordForm.this, MainActivity.class);
                ForgotPasswordForm.this.startActivity(myintent);
            }
        });

        btnfSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(ForgotPasswordForm.this,fpassConfirmation.class);
                ForgotPasswordForm.this.startActivity(myintent);
            }
        });
    }
}