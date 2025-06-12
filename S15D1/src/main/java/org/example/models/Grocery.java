package org.example.models;

import java.util.*;

public class Grocery {
   public static List<String> groceryList = new ArrayList();

   public void startGrocery(){
       Scanner input = new Scanner(System.in);
       int choice = input.nextInt();
       switch(choice){
           case 0:
             break;
           case 1:
               System.out.print("Eklenmesini istediğiniz elemanları giriniz.");
               addItems(input.nextLine());
               break;
           case 2:
               System.out.print("Cıkarılmasını istediğiniz elemanları giriniz.");
               removeItems(input.nextLine());
               break;
       }
   }
    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            if (!checkItemIsInList(item)) {
                groceryList.add(item);
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input){
       String[] items = input.split(",");
       for(String item: items){
           item = item.trim().toLowerCase();
           groceryList.remove(item);
       }
        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product){
        return groceryList.contains(product.trim().toLowerCase());
    }

    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }
}
