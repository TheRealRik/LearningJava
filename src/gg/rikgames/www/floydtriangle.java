package gg.rikgames.www;

import java.util.Scanner;

public class floydtriangle {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        char [] userInput=s.toCharArray();
        for (int i = 0; i < userInput.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(userInput[j]);
            }
            System.out.println();
        }
    }
}
