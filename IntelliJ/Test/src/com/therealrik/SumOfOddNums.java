package com.therealrik;

public class SumOfOddNums {
    public static void main(String[] args) {
//        int i, sum = 0;
//        for(i = 1; i<=21;i++ ){
////            check for odd or not
//            if(i%2 != 0){
//                sum += i;
//            }
//        }
//        System.out.println("The Sum is= " + sum);



//        int i, sum = 0;
//        for(i = 1; i<=21;i++ ){
////            check for even or not
//            if(i%2 == 0){
//                sum += i;
//            }
//        }
//        System.out.println("The Sum is= " + sum);




//        int i, sum = 0;
//        for(i = 100; i<=999;i++ ){
////            check for even or not
//            if(i%2 == 0){
//                sum += i;
//            }
//        }
//        System.out.println("The Sum is= " + sum);

        int i, sum = 0;
        for(i = 101; i<=999;i+=2){
//            check for odd or not
            if(i%5 == 0){
                sum += i;
            }
        }
        System.out.println("The Sum is= " + sum);
    }
}
