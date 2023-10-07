package com.realrik;

import java.util.Scanner;

public class algebra {
    public static void main(String[] args) {
        Scanner rik = new Scanner(System.in);
        System.out.println("Enter the value for a and b");
        int a = rik.nextInt();
        int b = rik.nextInt();
        int val= a*a+b*b;
        int val2= a*b;
        int sol= val/val2;
        System.out.println("The answer is"+sol);
    }
}
