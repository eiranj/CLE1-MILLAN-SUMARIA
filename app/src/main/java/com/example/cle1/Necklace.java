package com.example.cle1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Necklace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necklace);
        Button button1 = findViewById(R.id.goldnecklacebtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Necklace.this, NecklaceG.class);
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.silvernecklacetbtn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Necklace.this, NecklaceS.class);
                startActivity(intent);
            }
        });
    }
}