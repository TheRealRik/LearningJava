package com.therealrik;

import java.util.Scanner;

public class Exercise_4_A {
    public static void main(String[] args) {
        int i;
        int a;
        int s = 0;

        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number:");
        a = number.nextInt();

        for (i = 1; i <= a; i++) {
            s = s + i;
        }
        System.out.println("The sum of numbers till " + a + " is " + s);

    }
    }
