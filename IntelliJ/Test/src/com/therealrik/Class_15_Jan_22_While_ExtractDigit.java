package com.therealrik;

public class Class_15_Jan_22_While_ExtractDigit {
    public static void main(String[] args) {
        int d,n=5470;
        while(n!=0){
            d=n%10;
            System.out.println(d);
            n=n/10;
        }
    }
}
