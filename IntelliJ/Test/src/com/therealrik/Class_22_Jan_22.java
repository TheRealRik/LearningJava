package com.therealrik;

public class Class_22_Jan_22 {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                if(i==j||i+j==6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
