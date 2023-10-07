package com.Summer_Projects_2;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args)
    {
        double P, R = 10.5, T, SI, A;
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter Your Total Amount");
        P = sc.nextInt();

        System.out.println("Please Enter Total Period");
        T = sc.nextInt();

        // Calculate simple interest
        SI = (P * T * R) / 100;
        A = (P + SI);
        System.out.println("Total Interest is = " + SI);
        System.out.println("Total Payable Amount = " + A);
    }
}
