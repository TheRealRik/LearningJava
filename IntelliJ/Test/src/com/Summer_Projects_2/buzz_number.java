package com.Summer_Projects_2;

import java.util.Scanner;

public class buzz_number {
    public static void main(String[] args) {
        Scanner rik=new Scanner(System.in);
        int n= rik.nextInt();
        if(n%10==7||n%7==0)
            System.out.println(n+ " Is a Buzz Number");
        else
            System.out.println(n+ " Is not a Buzz Number");
    }
}
