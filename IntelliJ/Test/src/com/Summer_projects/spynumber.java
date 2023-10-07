package com.Summer_projects;

import java.util.Scanner;

public class spynumber {
    public static void main(String[] args) {
        Scanner rik= new Scanner(System.in);
        int d,n,sum=0;int prod=1;
        n=rik.nextInt();
        while (n>0){
            d=n%10;
            sum=sum+d;
            prod=prod*d;
            n=n/10;
//            System.out.println(d);
        }
        System.out.println("The Sum is: "+sum);
        System.out.println("The Product is: "+prod);
        if(sum==prod){
            System.out.println("It is a Spy Number");
        }
        else{
            System.out.println("It is not a Spy Number");
        }
    }
}
