package com.therealrik;

public class Main {

    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 29;

        if (num <= 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num/i; i++) {
//            System.out.println("When i is " + i);
//            System.out.println("Reminders is " + num % i);
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " Is prime number");
        } else {
            System.out.println(num + " Is not prime number");
        }
    }
}
