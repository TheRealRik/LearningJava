package gg.rikgames.www;

import java.util.Scanner;

public class palPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, p, rev, s = 0, i, c = 0;
        System.out.println("Enter No.");
        n = scanner.nextInt();  // Input number from user
        p = n; // store the entered number in "p" variable

        for(i = 1; i <= p; i++) {
            if (p % i == 0) {
                c++;
            }
        }
        while(n > 0) {
            // extract last digit of the number
            rev = n % 10;
            s = s * 10 + rev; // store the digit last digit
            n = n / 10; // extract all digit except the last
        }
        if(p == s && c == 2) {       // comparing with original number
            System.out.println("Number is PalPrime : "+p);
        } else {
            System.out.println("Number is not PalPrime : "+p);
        }
    }
}

