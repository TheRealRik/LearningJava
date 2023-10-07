package com.therealrik;

import java.util.Scanner;

public class Class_15_Jan_22_While_AverageOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, digit, sum=0, totalNumber=0;
        float average;

        System.out.println("Enter a Number: ");
        n = sc.nextInt();

        while(n!=0){
            digit=n%10; //Extracting the last digit
            sum=sum+digit; //Getting the sum of digits
            totalNumber++; //Calculating the number of digits
            n=n/10; //Removing the last digit to fetch the remaining digits
        }
        average=(float)sum/totalNumber; //Finding the average
        System.out.println("The Average is: "+ average);
    }
}
