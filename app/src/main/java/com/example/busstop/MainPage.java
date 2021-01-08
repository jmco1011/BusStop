package com.example.busstop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainPage extends AppCompatActivity {
    TextView txtLogout;
    ImageButton btnScanner,btnAccnt,btnAddMoney;
    LinearLayout addmoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page2);
        txtLogout = findViewById(R.id.txtLogout);
        btnScanner = findViewById(R.id.btnScanner);
        btnAccnt = findViewById(R.id.btnAccnt);
        btnAddMoney = findViewById(R.id.btnAddMoney);
        addmoney = findViewById(R.id.addMoney);
        txtLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(MainPage.this,MainActivity.class);
                MainPage.this.startActivity(myintent);
            }
        });

        btnScanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }
        });
        btnAccnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(MainPage.this,accntPage.class);
                MainPage.this.startActivity(myintent);
            }
        });

        btnAddMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainPage.this);

                builder.setCancelable(true);
                builder.setTitle("Add Money");
                builder.setMessage("Account number");

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }

                });
                builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      addmoney.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
            }
        });

    }
}