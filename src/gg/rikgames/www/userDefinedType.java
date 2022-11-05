package gg.rikgames.www;

import java.util.Scanner;

public class userDefinedType {
    String name;
    String streetAddr;
    String town;
    String state;
    int pincode;

    public static void main(String[] args) {
        userDefinedType address1 = new userDefinedType();
        address1.getStreetAddr();
        address1.showStreetAddr();
    }

    private void getStreetAddr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        this.name = scanner.nextLine();
        System.out.println("Enter your address");
        this.streetAddr = scanner.nextLine();
        System.out.println("Enter your town name");
        this.town = scanner.nextLine();
        System.out.println("Enter your state name");
        this.state = scanner.nextLine();
        System.out.println("Enter your pin code");
        this.pincode = scanner.nextInt();
    }

    private void showStreetAddr() {
        System.out.print("Your details are: " + name + ", " + streetAddr + ", " + town + ", " + state + ", " + pincode);
    }
}
