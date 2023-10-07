package com.realrik;

import java.util.Scanner;

public class riwinumber {
    public static void main(String[] args) {
        Scanner rik=new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int l,ll,f;
        int n= rik.nextInt();
        ll=n%100;
        l=ll/10;
        f=n%10;
        if(l==f)
            System.out.println("Riwi Number");
        else
            System.out.println("Not Riwi Number");
    }
}
