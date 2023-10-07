public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Factorial Series:- ");
        int n1 = 0;
        int n2 = 19;
        int n3 = 20;
        System.out.print(n1 + " " + n2 + " ");
        while (n3 < 34) {
            n3 = n1 + n2;
            System.out.print(n3 + "   ");
            n1 = n2;
            n2 = n3;
        }
    }
}