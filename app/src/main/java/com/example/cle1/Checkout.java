package com.example.cle1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Checkout extends AppCompatActivity {
    TextView diamondtxt, amethysttxt, rubytxt, overheadcosttxt,labortxt,basepricetxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracelet_checkout);
         basepricetxt = findViewById(R.id.baseprice);
         diamondtxt = findViewById(R.id.Diamondtxt);
         amethysttxt = findViewById(R.id.Rubytxt);
         rubytxt = findViewById(R.id.Amethysttxt);
         overheadcosttxt = findViewById(R.id.overheadcosttxt);
         labortxt = findViewById(R.id.labortxt);

         String basepricestr = getIntent().getStringExtra("basepricestr");
         String diamondstr = getIntent().getStringExtra("diamondstr");
         String rubystr = getIntent().getStringExtra("rubystr");
         String amethyststr = getIntent().getStringExtra("amethyststr");
         String overheadcoststr = getIntent().getStringExtra("overheadcoststr");
         String laborcoststr = getIntent().getStringExtra("laborcoststr");

         basepricetxt.setText(basepricestr);
         diamondtxt.setText(diamondstr);
         rubytxt.setText(rubystr);
         amethysttxt.setText(amethyststr);
         overheadcosttxt.setText(overheadcoststr);
         labortxt.setText(laborcoststr);
    }
}