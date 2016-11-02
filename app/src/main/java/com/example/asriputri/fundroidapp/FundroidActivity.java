package com.example.asriputri.fundroidapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class FundroidActivity extends AppCompatActivity {
    private LinearLayout funbgcolor;
    private ImageView logo;
    private TextView feature;
    private Button button;
    private FundroidList fundroids;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundroid);

        funbgcolor = (LinearLayout) findViewById(R.id.activity_fundroid);
        logo = (ImageView) findViewById(R.id.logo);
        button = (Button) findViewById(R.id.button);
        feature = (TextView) findViewById(R.id.feature);
        fundroids = new FundroidList();


        final int[] droidID = {
                R.drawable.dratini,
                R.drawable.eevee,
                R.drawable.bullbasaur,
                R.drawable.squirtle,
                R.drawable.charmander,
                R.drawable.jigglypuff

        };

        final int[] bgcolorId = {0xffFFB74D, 0xffB39DDB, 0xff64B5F6, 0xffC51162, 0xff689F38, 0xff9E9D24};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(6);
                //Toast.makeText(FundroidActivity.this, "randomNumber : " + randomNumber, Toast.LENGTH_SHORT).show();
                funbgcolor.setBackgroundColor(bgcolorId[randomNumber]);
                logo.setImageResource(fundroids.getDroidID(randomNumber));
                feature.setText(fundroids.getFeatureText(randomNumber));
            }
        });




    }
}
