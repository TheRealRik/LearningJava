package Patterns;

import java.util.Scanner;

public class patternJ {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a; j++) {
                if (i == 1 || j == (a / 2 + 1) || (i == a && j < (a / 2 + 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
