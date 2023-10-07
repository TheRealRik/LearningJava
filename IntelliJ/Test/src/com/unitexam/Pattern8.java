package com.unitexam;

public class Pattern8 {
    public static void main(String[] args) {
        int r=0,c=0,n=5;
        for(r=5;r>=1;r--) {
            for (c = 1; c <= r - 1; c++) {
                System.out.print("  ");
            }
            for (c=r; c<=5; c++) {
                System.out.print(" " + r);
            }
            System.out.println();
        }
    }
}
