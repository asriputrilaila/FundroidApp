package com.example.asriputri.fundroidapp;

import java.util.ArrayList;

/**
 * Created by Asri Putri on 11/1/2016.
 */

public class FundroidList {
    private ArrayList<Fundroid> fundroids;

    public ArrayList<Fundroid> addFundroid(){
        fundroids = new ArrayList<Fundroid>();
        fundroids.add(new Fundroid(R.drawable.dratini, "Dratini"));
        fundroids.add(new Fundroid(R.drawable.eevee, "Eevee"));
        fundroids.add(new Fundroid(R.drawable.bullbasaur, "Bullbasaur"));
        fundroids.add(new Fundroid(R.drawable.squirtle, "Squirtle"));
        fundroids.add(new Fundroid(R.drawable.charmander, "Charmander"));
        fundroids.add(new Fundroid(R.drawable.jigglypuff, "Jigglypuff"));


        return null;


    }

    public FundroidList(){
        addFundroid();
    }

    public int getDroidID(int a){
        return  fundroids.get(a).getDroidID();
    }
    public String getFeatureText(int a){
        return fundroids.get(a).getFeatureText();
    }
}
