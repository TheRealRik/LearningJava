package com.realrik;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        int n;
        int i=2;
        int d=0,sum=0,count=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n= sc.nextInt();

        while (n!=0) {
            d = n % 10;
            while(i<n)
            {
                if(d%i == 0)
                {
                    count++;
                    break;
                }
                i++;
                }
            if(count==0) {
                sum = sum + d * d * d;
            }

            n = n / 10;
        }

        System.out.println("The Sum of digits is: "+sum);
    }
}
