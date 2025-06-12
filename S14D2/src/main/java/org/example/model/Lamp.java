package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private boolean battery;
    private int globRating;
    private LampType style;


    public Lamp(LampType style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getStyle() {
        return this.style;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public boolean isBattery(){
        return this.battery;
    }

    public int getGlobRating(){
        return this.globRating;
    }

}
