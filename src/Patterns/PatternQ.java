package Patterns;

import java.util.Scanner;

public class PatternQ {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a; j++) {
                if ((i == 1 && j < a - 2) || (j == 1 && i < a - 2) || (j == a - 3 && i < a - 2) || (i == a - 3 && j < a - 2) || (i == a - 4 && j == a - 4) || (i == a - 2 && j == a - 2) || (i == a - 1 && j == a - 1) || (i == a && j == a)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
