import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a number: ");
        Scanner rik = new Scanner(System.in);
        x = rik.nextInt();
        rik.close();
        System.out.println("The Factors are:");

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
