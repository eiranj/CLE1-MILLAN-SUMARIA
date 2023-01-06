package com.example.cle1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Checkout extends AppCompatActivity {
    TextView diamondtxt, amethysttxt, rubytxt, overheadcosttxt,labortxt,basepricetxt;
    Button retailbtn, wholesalebtn;
    int BasePrice,diamond,amethyst,ruby,LaborCost,OverheadCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
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

         BasePrice = Integer.parseInt(basepricetxt.getText().toString());
         diamond = Integer.parseInt(diamondtxt.getText().toString());
         amethyst = Integer.parseInt(amethysttxt.getText().toString());
         ruby = Integer.parseInt(rubytxt.getText().toString());
         LaborCost = Integer.parseInt(labortxt.getText().toString());
         OverheadCost = Integer.parseInt(overheadcosttxt.getText().toString());


        int Retail = BasePrice + diamond + amethyst + ruby + LaborCost + OverheadCost;
        int Wholesale = (BasePrice + diamond + amethyst + ruby + LaborCost + OverheadCost) / 2;
        double Wholesale2 = Math.round((BasePrice + LaborCost + OverheadCost) / 2.20);
        retailbtn = findViewById(R.id.RtlBtn);
        retailbtn.setOnClickListener(view -> {
            String resultMessage = ("₱" + Retail + "");
            Bundle args = new Bundle();
            args.putString("result", resultMessage);
            DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
            dialogFragmentImp.setArguments(args);
            dialogFragmentImp.show(getSupportFragmentManager(), "Total Payment");
        });
        wholesalebtn = findViewById(R.id.WhsBtn);
        wholesalebtn.setOnClickListener(view -> {
            String resultMessage = ("₱" + Wholesale + " each for minimum of 20 orders. \n ₱" + Wholesale2 + " each for 30 orders and more.");
            Bundle args = new Bundle();
            args.putString("result", resultMessage);
            DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
            dialogFragmentImp.setArguments(args);
            dialogFragmentImp.show(getSupportFragmentManager(), "Total Payment");

        });
    }
}