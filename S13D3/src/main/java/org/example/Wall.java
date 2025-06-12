package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double setWidth (double sayi) {
        if(sayi < 0){
            width = 0;
        } else {
            width =sayi;
        }
        return width;
    }

    public double setHeight (double sayi) {
        if(sayi < 0){
            height = 0;
        } else {
            height =sayi;
        }
        return height;
    }

    public double getArea () {
        return height * width;
    }

}
