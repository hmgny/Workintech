package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }
    public String startEngine(){
        return getClass().getSimpleName() + ": Mitsubishi engine is starting";
    }
    public String accelerate(){
        return getClass().getSimpleName() + ": Mitsubishi is accelerating";
    }
    public String brake(){
        return getClass().getSimpleName() + ": Mitsubishi is braking";
    }

}
