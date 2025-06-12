package org.example.arge;

public class CarSkeleton {
    String name;
    String description;

    public CarSkeleton(){}
    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void startEngine(){

    }
    public void drive(){

    }
    protected void runEngine(){

    }
}
