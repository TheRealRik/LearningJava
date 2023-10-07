package com.Summer_projects;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int lcm=0, a, b;
        Scanner rik= new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        a=rik.nextInt();
        System.out.println("Please enter your second number");
        b=rik.nextInt();

        //Maximum number between a and b will be stored in LCM variable
        lcm=(a>b) ? a:b;

        //always true
        while(true){
            if (lcm%a==0 && lcm%b==0){
                System.out.println("The LCM of " + a+ " and "+ b+ " is " + lcm);
//                System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
                break;
            }
            ++lcm;
        }
    }
}
