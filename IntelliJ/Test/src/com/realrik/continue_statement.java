package com.realrik;

import java.sql.SQLOutput;

public class continue_statement {
    public static void main(String[] args) {
        int x;
        for(x=1;x<=10;x++){
            if(x==9)
                continue;
            System.out.println("x="+x);
        }
    }
}
