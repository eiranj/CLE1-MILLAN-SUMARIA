package com.example.cle1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class BraceletS extends AppCompatActivity {
    CheckBox cbone, cbtwo, cbthree;
    Button retailbtn, wholesalebtn, button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracelet_s);
        cbone = findViewById(R.id.diamond);
        cbtwo = findViewById(R.id.ruby);
        cbthree = findViewById(R.id.amethyst);

        button = findViewById(R.id.add);
        button.setOnClickListener(v -> {


            int BasePrice = 4300;
            int LaborCost = 3000;
            int diamond = 0;
            int amethyst = 0;
            int ruby = 0;
            int OverheadCost = 2500;


            if (cbone.isChecked()) {
                diamond = 12375;

            }

            if (cbtwo.isChecked()) {
                amethyst = 1672;

            }

            if (cbthree.isChecked()) {
                ruby = 27867;
            }



            button2 = findViewById(R.id.checkoutbtn);
            int finalDiamond = diamond;
            int finalRuby = ruby;
            int finalAmethyst = amethyst;
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String BasePricestr = String.valueOf(BasePrice);
                    String LaborCoststr = String.valueOf(LaborCost);
                    String OverheadCoststr = String.valueOf(OverheadCost);
                    String Diamondstr = String.valueOf(finalDiamond);
                    String Rubystr = String.valueOf(finalRuby);
                    String Amethyststr = String.valueOf(finalAmethyst);
                    Intent intent = new Intent(BraceletS.this, Checkout.class);

                    intent.putExtra("basepricestr", BasePricestr);
                    intent.putExtra("laborcoststr", LaborCoststr);
                    intent.putExtra("overheadcoststr", OverheadCoststr);
                    intent.putExtra("diamondstr", Diamondstr);
                    intent.putExtra("rubystr", Rubystr);
                    intent.putExtra("amethyststr", Amethyststr);
                    startActivity(intent);
                }
            });
        });
    }
}