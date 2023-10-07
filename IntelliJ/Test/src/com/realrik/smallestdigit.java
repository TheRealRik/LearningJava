package com.realrik;
import java.util.Scanner;

public class smallestdigit {
    public static void main(String[] args) {
        Scanner cs= new Scanner (System.in);

         System.out.println ("Enter the number");

         int num = cs.nextInt ();

        int reminder, smallest=num%10;

        while (num > 0) {
        reminder = num % 10;

        if (smallest > reminder) {
                smallest= reminder;
            }
            num = num / 10;
        }

        System.out.println("The Smallest Digit is "+smallest);
        cs.close();

 }

}
