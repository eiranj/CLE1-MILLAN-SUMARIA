package com.example.cle1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bracelet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracelet);
        Button button1 = findViewById(R.id.goldbraceletbtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bracelet.this, BraceletG.class);
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.silverbraceletbtn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bracelet.this, BraceletS.class);
                startActivity(intent);
            }
        });


    }
}