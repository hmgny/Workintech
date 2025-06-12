package org.example.model;

public class Coke extends ProductForSale {

    private boolean isDiet;
    public Coke(String type, double price, String description){
        super(type,price,description);
    }
    public Coke(String type, double price, String description, boolean isDiet){
        super(type,price,description);
        this.isDiet = isDiet;
    }
    public boolean getIsDiet(){
        return isDiet;
    }
    public void setIsDiet(boolean isDiet){}

    public void showDetails() {
        System.out.println("price : " + getPrice());
        System.out.println("type : " + getType());
        System.out.println("description : " + getDescription());
        System.out.println("Diet : " + (getIsDiet() ? "Yes" : "No"));

    };
}
