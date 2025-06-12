package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Chocolate", 5.99, "Delicious dark chocolate", "Dark");
        products[1] = new Coke("Coke", 1.99, "Refreshing soda", true);
        products[2] = new Bread("Bread", 2.49, "Fresh whole wheat bread", "Whole Wheat");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
        }
    }
}