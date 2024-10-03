/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject18;

/**
 *
 * @author PC
 */
public class Pizza {
    public static final int MAX_TOPPING = 10;
    
    private String[] toppings;
    private int totalToppings;

    public Pizza() {
        this.toppings = new String[MAX_TOPPING];
        this.totalToppings = 0;
    }

    public void addTopping(String topping) {
        if (totalToppings < MAX_TOPPING) {
            toppings[totalToppings] = topping;
            totalToppings++;
            System.out.println("Added topping: " + topping);
        } else {
            System.out.println("Cannot add more toppings. Maximum limit of " + MAX_TOPPING + " reached.");
        }
    }

    public void printAllToppings() {
        System.out.println("Toppings on your pizza:");
        for (int i = 0; i < totalToppings; i++) {
            System.out.println((i + 1) + ". " + toppings[i]);
        }
    }

    public int getTotalToppings() {
        return totalToppings;
    }

    public int getPrice() {
        int basePrice = 100;
        int toppingPrice = totalToppings * 10;
        return basePrice + toppingPrice;
    }
}