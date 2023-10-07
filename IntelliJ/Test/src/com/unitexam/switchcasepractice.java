package com.unitexam;

import java.util.Scanner;

public class switchcasepractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 4");
        int n=sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Train");
                break;
            case 2:
                System.out.println("Bus");
                break;
            case 3:
                System.out.println("Ship");
                break;
            case 4:
                System.out.println("Plane");
                break;
            default:
                System.out.println("Superman");
        }
    }
}
