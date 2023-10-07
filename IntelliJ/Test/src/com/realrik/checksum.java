package com.realrik;

import java.util.Scanner;

public class checksum {
    public static void main(String[] args) {
        Scanner rik= new Scanner(System.in);
        int d,n,sum=0;
        n=rik.nextInt();
        while (n>0){
            d=n%10;
            sum=sum+d;
            n=n/10;
            System.out.println(d);
        }
        System.out.println("The Sum is: "+sum);
        if(sum%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
