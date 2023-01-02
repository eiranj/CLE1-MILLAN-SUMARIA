package com.example.cle1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class BraceletG extends AppCompatActivity {
    CheckBox cbone, cbtwo, cbthree;
    Button retailbtn, wholesalebtn, button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracelet_g);
        cbone = findViewById(R.id.diamond);
        cbtwo = findViewById(R.id.ruby);
        cbthree = findViewById(R.id.amethyst);

        button = findViewById(R.id.checkoutbtn);
        button.setOnClickListener(v -> {

        int BasePrice = 15300;
        int LaborCost = 3000;
        int diamond = 0;
        int amethyst = 0;
        int ruby = 0;
        int OverheadCost = 2500;

        StringBuilder Result = new StringBuilder();
        Result.append("Selected Gems: \nOverhead Cost = ₱2500 \nLabor Cost = ₱3000");

        if (cbone.isChecked()) {
            Result.append("\n Diamond = ₱12,375");
            diamond = 12375;

        }

        if (cbtwo.isChecked()) {
            Result.append("\n Amethyst = ₱1,672");
            amethyst = 1672;

        }

        if (cbthree.isChecked()) {
            Result.append("\n Ruby = ₱27,867");
            ruby = 27867;
        }

        int Retail = BasePrice + diamond + amethyst + ruby + LaborCost + OverheadCost;
        int Wholesale = (BasePrice + diamond + amethyst + ruby + LaborCost + OverheadCost) / 2;
        double Wholesale2 = Math.round((BasePrice + LaborCost + OverheadCost) / 2.20);
        Toast.makeText(BraceletG.this, Result.toString(), Toast.LENGTH_SHORT).show();

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
    });
    }
}