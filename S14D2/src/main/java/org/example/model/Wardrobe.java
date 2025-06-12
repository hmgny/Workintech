package org.example.model;

public class Wardrobe {
    private int width;
    private int height;
    private double weight;

    public Wardrobe(int width, int height, double weight){
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    public int getWidth(){
        return this.width = width;
    }
    public int getHeight(){
        return this.height = height;
    }
    public double getWeight(){
        return this.weight = weight;
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }
}
