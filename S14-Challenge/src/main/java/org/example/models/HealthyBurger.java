package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType){
        super(name,"Tofu",price,breadRollType);
    }
    public String getHealthyExtra1Name(){
        return healthyExtra1Name;
    }
    public String getHealthyExtra2Name(){
        return healthyExtra2Name;
    }
    public double getHealthyExtra1Price(){
        return healthyExtra1Price;
    }
    public double getHealthyExtra2Price(){
        return healthyExtra2Price;
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double getPrice(){
        double totalPrice = super.getPrice();
        if (healthyExtra1Price > 0) {
            totalPrice += healthyExtra1Price;
        }
        if(healthyExtra2Price > 0){
            totalPrice += healthyExtra2Price;
        }
        return totalPrice;
    }

}
