package com.Summer_Projects_2;

import java.util.Scanner;

public class SlabSystem {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double a,bill,tax,tBill;
        System.out.println("Enter the total electricity units");
        a = sc.nextDouble();

        //Bill calculation
        if(a<=50)
        {
            bill=(6.75*a);
        }
        else if((a>50)&&(a<=170))
        {
            bill=(50*6.75)+((a-50)*7.0);
        }
        else if((a>170)&&(a<=300))
        {
            bill=(50*6.75)+(120*7.0)+((a-170)*8.5);
        }
        else
        {
            bill=(50*6.75)+(120*7.0)+(130*8.5)+((a-300)*9.0);
        }

        //Add surcharge and tax
        tax= ((18*bill)/100);

        //Total bill value
        tBill= (tax+bill);

        System.out.println(tBill + " is your total bill");
    }
}
