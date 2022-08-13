package gg.rikgames.www;

import java.util.*;

public class Homework {

    double t;
    public double calculate(double x){
        t = x - ((25.00/100.00)*x);
        return t;
    }
    void display(){
        System.out.println("Enter the amount of pen");
    }
    void output(){
        System.out.println("The Amount to be paid is " + t);
    }

    public static void main(String[] args){
    Homework obj = new Homework();
        int n;
        Scanner sc = new Scanner(System.in);
    obj.display();
        n = sc.nextInt();
    obj.calculate(n);
    obj.output();
    }
}
