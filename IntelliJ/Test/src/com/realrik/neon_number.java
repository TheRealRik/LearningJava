package com.realrik;

import java.util.Scanner;

public class neon_number {
    public static void main(String[] args) {
        int sum=0,n;
        Scanner rik= new Scanner(System.in);
        System.out.println("Enter a number");
        n=rik.nextInt();
        int square=n*n;
        while(square>0){
            int digit=square%10;
            sum=sum+digit;
            square=square/10;
        }
if(n==sum) {
    System.out.println("It is a neon number");
    }
    else{
        System.out.println("It is not a neon number");
    }

    }
}
