package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String  addition1Name;
    private String  addition2Name;
    private String  addition3Name;
    private String  addition4Name;
    private double  addition1Price;
    private double  addition2Price;
    private double  addition3Price;
    private double  addition4Price;

    public Hamburger(){}

    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType =breadRollType;
    }
    public Hamburger(String name, String meat, double price, String breadRollType,String addition1Name, double addition1Price){
        this(name,meat,price,breadRollType);
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;

    }
    public Hamburger(String name, String meat, double price, String breadRollType,String addition1Name, double addition1Price,String addition2Name, double addition2Price){
        this(name,meat,price,breadRollType,addition1Name,addition1Price);
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public Hamburger(String name, String meat, double price, String breadRollType,String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price){
        this(name,meat,price,breadRollType,addition1Name,addition1Price, addition2Name,addition2Price);
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public Hamburger(String name, String meat, double price, String breadRollType,String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price, String addition4Name, double addition4Price){
        this(name,meat,price,breadRollType,addition1Name,addition1Price, addition2Name,addition2Price, addition3Name, addition3Price);
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }


    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        double totalPrice = this.price;
        if (addition1Price > 0) totalPrice += addition1Price;
        if (addition2Price > 0) totalPrice += addition2Price;
        if (addition3Price > 0) totalPrice += addition3Price;
        if (addition4Price > 0) totalPrice += addition4Price;
        return totalPrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }
    public String itemizeHamburger() {
        String details = name + " hamburger on a " + breadRollType + " roll with " + meat + " meat.";
        double totalPrice = price;
        if (addition1Name != null) {
            details += " Added " + addition1Name + " for an extra " + addition1Price;
            totalPrice += addition1Price;
        }
        if (addition2Name != null) {
            details += " Added " + addition2Name + " for an extra " + addition2Price;
            totalPrice += addition2Price;
        }
        if (addition3Name != null) {
            details += " Added " + addition3Name + " for an extra " + addition3Price;
            totalPrice += addition3Price;
        }
        if (addition4Name != null) {
            details += " Added " + addition4Name + " for an extra " + addition4Price;
            totalPrice += addition4Price;
        }
        details += " Total price: " + totalPrice;
        return details;
    }
}
