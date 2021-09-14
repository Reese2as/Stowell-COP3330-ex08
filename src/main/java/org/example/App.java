/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int People, Pizzas, Slices, Leftovers, Total_Slices, Pizza_PerPerson;
        
        System.out.print("How many people? ");
        People = user_input.nextInt();
        System.out.print("How many pizzas do you have? ");
        Pizzas = user_input.nextInt();
        System.out.print("How many slices per pizza? ");
        Slices = user_input.nextInt();
        
        Total_Slices=(Slices*Pizzas);
        Pizza_PerPerson= (Total_Slices/People);
        Leftovers = (People%Pizzas);
        
        System.out.println(String.format("%d people with %d pizzas (%d slices)", People, Pizzas, Total_Slices));
        System.out.println(String.format("Each person gets %d pieces of pizza",Pizza_PerPerson));
        System.out.println(String.format("There are %d leftover pieces",Leftovers));
    }
}
