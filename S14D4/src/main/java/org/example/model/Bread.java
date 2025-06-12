package org.example.model;

public class Bread extends ProductForSale{
    private String breadType;

    public Bread(String type, double price, String description){
        super(type,price,description);

    }
    public Bread(String type, double price, String description, String breadType){
        super(type,price,description);
        this.breadType = breadType;
    }
    public String getBreadType(){
        return breadType;
    }
    public void setBreadType(String breadType){}

    public void showDetails() {
        System.out.println("price : " + getPrice());
        System.out.println("type : " + getType());
        System.out.println("description : " + getDescription());
        System.out.println("bread type : " + getBreadType());

    };
}
