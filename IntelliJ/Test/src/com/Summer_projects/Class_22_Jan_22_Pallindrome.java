package com.Summer_projects;

import java.util.Scanner;

public class Class_22_Jan_22_Pallindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,r,sum=0,temp;
        System.out.println("Enter The Number");
        n = sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
    if(temp==sum)
        System.out.println("The Number Is A Palindrome");
    else
        System.out.println("The Number Is Not A Palindrome");
    }
}
