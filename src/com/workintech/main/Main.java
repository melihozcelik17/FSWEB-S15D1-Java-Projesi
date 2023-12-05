package com.workintech.main;

import com.workintech.groceryList.MarketCar;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> grocerList=new LinkedList<>();
        System.out.println("Hello world!");
        startGrocery(grocerList);
    }

    public static void startGrocery(List<String> groceryList){
        Scanner scanner=new Scanner(System.in);
                while(true){
                    try{
                        System.out.println("Yapmak istediğiniz işlemi giriniz");
                        int process=scanner.nextInt();
                        if(process < 0 || process>2){
                        System.out.println("Process must be between 0 to 2");
                    }

                    if(process== 0 ){
                        System.exit(0);

                    }
                    if(process== 1 ){
                        MarketCar.addItems(groceryList);

                    }
                    if(process==2 ){
                        MarketCar.removeItems(groceryList);

                    }
                } catch (exception ex){
                        System.out.println("Invalid process: " + ex.getMessage());
                    }

        }
    }


}