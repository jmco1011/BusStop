package com.example.busstop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationForm extends AppCompatActivity {
    Button btnrSubmit, btnrCancel;
    EditText rfname,rlname,rpnum,remail,rUsername,rPassword;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
        btnrSubmit = findViewById(R.id.btnrSubmit);
        btnrCancel = findViewById(R.id.btnrCancel);
        rfname = findViewById(R.id.rfname);
        rlname = findViewById(R.id.rlname);
        remail = findViewById(R.id.remail);
        rpnum = findViewById(R.id.rpnum);
        rUsername = findViewById(R.id.rUsername);
        rPassword = findViewById(R.id.rPassword);

        btnrCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(RegistrationForm.this, MainActivity.class);
                RegistrationForm.this.startActivity(myintent);
            }
        });

        btnrSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_SHORT).show();
                Intent myintent = new Intent(RegistrationForm.this, MainActivity.class);
                RegistrationForm.this.startActivity(myintent);
            }
        });
    }
}