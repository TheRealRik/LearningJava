package Patterns;

import java.util.Scanner;

public class PatternX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, counter = 1;
        int a = sc.nextInt();
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a; j++) {
                if (j == counter || j == a - counter + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            counter++;
            System.out.println();
        }
    }
}
