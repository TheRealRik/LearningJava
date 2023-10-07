package com.unitexam;

public class Pattern4 {
    public static void main(String[] args) {
        int i=0,n=0;
        for(i=1;i<=5;i++){
            for (n=1; n<i ;n++){
                System.out.print("  ");
            }
            for(n=i; n<=5 ;n++){
                System.out.print(" "+n);
            }
            System.out.println();
        }
    }
}
