package com.therealrik;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner rk= new Scanner(System.in);
        int fact = 1;
        int i;
        int number;
        System.out.println("Please enter a number to get the factorial: ");
        number = rk.nextInt();
        for (i=1; i<=number; i++){
            fact *= i;
        }
        System.out.println("Factorial of " +number+ " is: " + fact);
    }
}
