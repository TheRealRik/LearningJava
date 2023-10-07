package com.Summer_projects;

import java.util.Scanner;

public class driven_p {
    public static void main(String[] args) {
        Scanner rik= new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Multiples of 5");
        System.out.println("2. Multiples of 6");
        System.out.println("Please Enter your choice: ");
        int ch =rik.nextInt();
        switch (ch){
            case 1:
                int i;
                for(i=5;i<=50;i=i+5){
                    System.out.println(i + " ");
                }
                break;
            case 2:
                int x;
                for(x=6;x<=60;x=x+6){
                    System.out.println(x + " ");
                }
                break;
            default:
                System.out.println("Option does not Exists");
        }
    }
}
