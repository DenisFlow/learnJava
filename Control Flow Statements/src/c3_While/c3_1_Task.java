//package c3_While;
//
//public class c3_1_Task {
//    public static void voidTask(){
//        System.out.println(sumOfDigits(125));;
//    }
///*
//Write a method with the name sumDigits that has one int parameter called number. If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
//The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process negative numbers, so also return -1 for negative numbers.
//For example calling the method sumDigits(125) should return 8 since 1 +2 + 5 = 8.
//Calling the method sumDigits(l) should return -1 as per requirements described above.
//
//*/
//    public static int sumOfDigits(int number){
//        if (number <= 10) {
//            return -1;
//        } else {
//            int sum = 0;
//            while (number > 0) {
//                sum += number % 10;
//                number = number / 10;
//            }
//            return sum;
//        }
//
//    }
//}
