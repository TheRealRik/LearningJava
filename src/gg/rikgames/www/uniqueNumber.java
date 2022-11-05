package gg.rikgames.www;

import java.util.Scanner;

public class uniqueNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ar = new int[100]; //array for storing and comparing digits
        int k = 0, a = 0, length;
        String userInput;
        char ch;
        System.out.println("Enter Number ");
        userInput = in.nextLine(); //Input number as a string
        length = userInput.length(); // storing length of string
        if (userInput.charAt(0) == '0') // if 0 is leading the number
        {
            System.out.println("It is not a Unique Number : " + userInput);
        } else {
            for (int i = 0; i < length; i++) {
                ch = userInput.charAt(i);
                ar[a] = (int) ch; //storing each digit of the number
                a++;
            }
            for (int i = 0; i < (a - 1); i++) {
                for (int j = i; j < (a - 1); j++) {
                    if (ar[i] == ar[j + 1]) // comparing digits
                    {
                        k = 1; // if the digit are same than changing value of k to 1
                        break; //using break statement to jump out of inner for loop
                    }
                }
                if (k == 1) {
                    break; //using break statement to jump out of outer for loop
                }
            }
            if (k == 1) // if k is equal to 1
            {
                System.out.println("It is not a Unique Number : " + userInput);
            } else {
                System.out.println("It is a Unique Number : " + userInput);
            }
        }
    }
}
