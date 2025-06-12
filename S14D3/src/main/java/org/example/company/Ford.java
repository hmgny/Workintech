package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }
    public String startEngine(){
        return getClass().getSimpleName() + ": Ford engine is starting";
    }
    public String accelerate(){
        return getClass().getSimpleName() + ": Ford is accelerating";
    }
    public String brake(){
        return getClass().getSimpleName() + ": Ford is braking";
    }
}
