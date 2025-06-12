package org.example.model;

public class Chocolate extends ProductForSale{
    private String brand;

    public Chocolate(String type, double price, String description){
        super(type,price,description);

    }
    public Chocolate(String type, double price, String description, String brand){
        super(type,price,description);
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){}

    public void showDetails() {
        System.out.println("price : " + getPrice());
        System.out.println("type : " + getType());
        System.out.println("description : " + getDescription());
        System.out.println("brand : " + getBrand());

    };
}
