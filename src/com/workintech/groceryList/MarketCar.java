package com.workintech.groceryList;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class MarketCar {
    private static String getInput() {
        Scanner scanner = new Scanner((System.in));
        return scanner.nextLine();
    }

    public static void addItems(List<String> groceryList) {
        System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
        String input = getInput();

        if (input.contains(",")) {
            String[] elements = input.split(",");
            for (String element : elements) {
                if (element != null && element.isEmpty()) {
                    if (!checkItemIsInList(groceryList, element)) {

                    }
                }
        }
        } else {
            if(input!=null && !input.isEmpty()){
                groceryList.add(input);
            }


        }
        printSorted(groceryList);
    }

    public static void removeItems(List<String> groceryList){
        System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
        String input = getInput();

        if (input.contains(",")) {
            String[] elements = input.split(",");
            for (String element : elements) {
                if (element != null && element.isEmpty()) {
                    if (checkItemIsInList(groceryList, element)) {

                    }
                }
            }
        } else {
            if(input!=null && !input.isEmpty()){
                groceryList.remove(input);
            }


        }
        printSorted(groceryList);

    }

    public static boolean checkItemIsInList(List<String> products, String product){
     return products.contains(product.trim());

    }

    public static void printSorted(List<String> products){
        Collection.sort(products);
        System.out.println(products);
        for(String product:products){
            System.out.println(product);
        }
    }

    public static void removeItems(List<String> groceryList) {

    }
}
