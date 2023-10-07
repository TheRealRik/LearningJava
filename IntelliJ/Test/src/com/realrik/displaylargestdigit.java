package com.realrik;

import java.util.Scanner;

public class displaylargestdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,d,l;
        System.out.println("Enter the number");
        n=sc.nextInt();
        l=n%10;
        n=n/10;

        while(n!=0){
            d=n%10;

            if(d>l)
                l=d;
            n=n/10;
        }
        System.out.println("The largest Digit is: "+l);
    }
}
