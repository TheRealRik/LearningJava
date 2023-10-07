package com.therealrik;

import java.util.Scanner;

//Write a program in java to sum this series: 1/2+2/3+3/4+....+n
public class Average {
    public static void main(String[] args) {
        float i,s=0;
        float x;
        Scanner myUserInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = myUserInput.nextInt();

        for (i=1;i<=x;i++){
            s=s+i/(i+1);
            System.out.println(s);
        }
        System.out.println("Sum = " + s);
    }
}
