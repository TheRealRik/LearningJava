package gg.rikgames.www;

import java.util.Scanner;

public class happyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, p, i, j, k = 0, rev, s = 0, x;
        int[] ar = new int[100];
        System.out.println("Enter Number");
        n = in.nextInt();// Enter number from user
        p = n; // Store the copy of input number
        for (i = 0; ; i++) {
            while (n > 0) {
                rev = n % 10;
                s = s + (rev * rev);
                n = n / 10;
                ar[i] = s;
            }
            for (j = 0; j < i; j++) {
                if (ar[j] == ar[i]) {
                    for (x = 0; x <= i; x++) {
                        System.out.print(ar[x] + "\t");
                    }
                    System.out.println();
                    System.out.println("It is not a Happy Number : " + p);
                    k = 1;
                    break;
                }
            }
            if (k == 1) {
                break;
            } else if (s == 1) {
                for (x = 0; x <= i; x++) {
                    System.out.print(ar[x] + "\t");
                }
                System.out.println();
                System.out.println("It is a Happy Number : " + p);
                break;
            } else {
                n = s;
                s = 0;
            }
        } // end of for loop
    }
}
