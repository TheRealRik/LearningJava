package gg.rikgames.www;

import java.util.Scanner;

public class patternPrinting {


    public static void main(String[] args) {
        //int i, j;
        Scanner sc = new Scanner(System.in);

        //Drawing A
        System.out.println("Enter the number of rows for A");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns for A");
        int x = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= x; j++)
                if (i == 1 || i == (m / 2) + 1 || j == 1 || j == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        //Drawing S
        System.out.println("Enter height of the pattern S");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n / 2 || i == n - 1)) {
                    System.out.print("*");
                } else if (i < n / 2 && j == 0) {
                    System.out.print("*");
                } else if (i > n / 2 && j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");

        System.out.println("Enter height of the pattern Z");
        int height = sc.nextInt();
        int count = height - 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || j == count || i == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            count = count - 1;
            System.out.println();
        }
        // close Scanner class object
        sc.close();
    }
}
