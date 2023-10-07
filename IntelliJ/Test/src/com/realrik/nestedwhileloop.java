package com.realrik;

public class nestedwhileloop {
    public static void main(String[] args) {
        int x,y;
        x=1;
        while(x<=3){
            y=1;
            while(y<=3) {
                System.out.println("X = " + x + ";" + " Y = " + y);
                y++;
            }
            x++;
        }
    }
}