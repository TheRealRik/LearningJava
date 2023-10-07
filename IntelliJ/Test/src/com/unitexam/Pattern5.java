package com.unitexam;

public class Pattern5 {
    public static void main(String[] args) {
        int r=0,c=0,n=5;
        for(r=1; r<=n; r++){
            for(c=r;c<=n-1;c++){
                System.out.print("  ");
            }
            for(c=1;c<=r;c++){
                System.out.print(" "+c);
            }
            System.out.println();
        }
    }
}
