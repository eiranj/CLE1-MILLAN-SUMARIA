package com.example.cle1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class RingsG extends AppCompatActivity {

    CheckBox cbone, cbtwo, cbthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rings_g);
        cbone=findViewById(R.id.diamond);
        cbtwo=findViewById(R.id.ruby);
        cbthree=findViewById(R.id.amethyst);
    }
}