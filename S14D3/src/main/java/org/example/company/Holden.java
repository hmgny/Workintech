package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }
    public String startEngine(){
        return getClass().getSimpleName() + ": Holden engine is starting";
    }
    public String accelerate(){
        return getClass().getSimpleName() + ": Holden is accelerating";
    }
    public String brake(){
        return getClass().getSimpleName() + ": Holden is braking";
    }
}
