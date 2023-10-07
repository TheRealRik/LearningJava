package com.realrik;

public class ereturn {
    public static void exit(){
        System.out.println("Before the return");
        if(true)
            return;
        System.out.println("This won't execute");
    }

    public static void test() {
        exit();
    }
}
