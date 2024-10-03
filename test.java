/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject18;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        
        Scanner scanner = new Scanner(System.in);
        String inputTopping;

        while (true) {
            System.out.println("Enter a topping to add (or type 'done' to finish):");
            inputTopping = scanner.nextLine();

            if (inputTopping.equalsIgnoreCase("done")) {
                break;
            }

            pizza.addTopping(inputTopping);
        }

        pizza.printAllToppings();
        System.out.println("Total number of toppings: " + pizza.getTotalToppings());
        System.out.println("Total price of the pizza: " + pizza.getPrice() + " Baht");
    }
}