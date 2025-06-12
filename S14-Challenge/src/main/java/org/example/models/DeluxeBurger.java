package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips = "CURVY";
    private String drink = "COKE";

    public DeluxeBurger(){
    }

    public DeluxeBurger(String name, String meat, double price, String breadRollType){
        super(name,meat,19.10,breadRollType);
    }

    public String getCips(){
        return cips;
    }
    public String getDrink(){
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public String itemizeHamburger() {
        String details = super.itemizeHamburger() + " Includes chips (" + getCips() + ") and drink (" + getDrink() + ").";
        details += " Total price: " + getPrice();
        return details;
    }
    @Override
    public double getPrice(){
       return  19.10;
    }
}
