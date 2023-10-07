package com.therealrik;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        int n, i, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to get Factors");
        n=sc.nextInt();

        for (i=1; i<=n; i++){
            if (n%i == 0){
                count++;
            }
        }
        System.out.print("The number of factors of "+ n + " is "+ count);
    }
}

