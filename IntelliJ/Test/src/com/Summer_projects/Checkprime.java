package com.Summer_projects;

import java.util.Scanner;

public class Checkprime {
    public static void main(String[] args) {
        int i,num;
        boolean isPrime;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the integer");
        num=sc.nextInt();

        if(num<=2)
            isPrime=false;
        else
            isPrime=true;

        for (i=2; i<=num/i; i++){
            if((num%i) == 0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println("The number is Prime");
        }
        else{
            System.out.println("The number is Not Prime");
        }
    }
}
