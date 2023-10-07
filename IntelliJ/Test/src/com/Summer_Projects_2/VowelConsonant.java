package com.Summer_Projects_2;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char alphabet;
        System.out.println("Please Enter an Alphabet");
        alphabet = sc.next().charAt(0);

        // Convert lower to upper
        char fChar = Character.toUpperCase(alphabet);

        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' )
            System.out.println(fChar + " is vowel");
        else
            System.out.println(fChar + " is consonant");

    }
}
