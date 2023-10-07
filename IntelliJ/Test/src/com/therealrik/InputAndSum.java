package com.therealrik;

import java.util.Scanner;

public class InputAndSum {
    public static void main(String[] args) {
        int i, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a 10 numbers");

        for (i = 1; i <= 10; i++) { // Only for input number
            n = sc.nextInt();
            if (n % 9 == 0) { // Only for output result
                sum = sum + n;
            }
        }
        System.out.println("The Sum is " + sum);
    }
}
