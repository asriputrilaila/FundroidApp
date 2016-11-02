package com.example.asriputri.fundroidapp;

/**
 * Created by Asri Putri on 11/1/2016.
 */

public class Fundroid {
    private int droidID;
    private String FeatureText;

    public Fundroid(int droidID, String featureText) {
        this.droidID = droidID;
        FeatureText = featureText;
    }

    public void setDroidID(int droidID) {
        this.droidID = droidID;
    }

    public void setFeatureText(String featureText) {
        FeatureText = featureText;
    }

    public int getDroidID() {
        return droidID;
    }

    public String getFeatureText() {
        return FeatureText;
    }
}
