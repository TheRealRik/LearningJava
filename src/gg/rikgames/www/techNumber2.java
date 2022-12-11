package gg.rikgames.www;

import java.util.Scanner;

public class techNumber2 {
    public static void main(String[] args) {
        int ls, rs, x, c = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            c++;
            n = n / 10;
        }
        x = (int) Math.pow(10, c);
        ls = n % x;
        rs = n / x;
        if (n == (rs * rs) + (ls * ls)) {
            System.out.println("Tech Number");
        } else {
            System.out.println("Not Tech Number");
        }
    }
}
