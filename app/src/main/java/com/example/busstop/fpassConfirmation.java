package com.example.busstop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fpassConfirmation extends AppCompatActivity {
    Button btnfpc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpass_confirmation);
    btnfpc = findViewById(R.id.btnfpc);

    btnfpc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent myintent = new Intent(fpassConfirmation.this, MainActivity.class);
            fpassConfirmation.this.startActivity(myintent);
        }
    });
    }
}