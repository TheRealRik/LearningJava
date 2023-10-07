package com.Summer_projects;

import java.util.Scanner;

public class nivennumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,d,sum=0;
        n=sc.nextInt();
        while (n>0){
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        if(n%sum==0)
            System.out.println("Niven Number");
        else
            System.out.println("Not Niven Number");
    }
}
