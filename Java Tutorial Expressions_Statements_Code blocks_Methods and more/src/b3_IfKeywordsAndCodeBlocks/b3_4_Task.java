//package b3_IfKeywordsAndCodeBlocks;
//
///*
//1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long
//If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
//Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.
//
//
//2. Write another method called printconversion with 1 parameter of type double with the name kilometersPerHour.
//        This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
//        Then it needs to print a message in the format "XX km/h = YY mi/h".
//        XX represents the original value kilometersPerHour
//        YY represents the rounded milesPerHour from the kilometersPerHour parameter.
//        If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".
//
//
//
//*/
//
//public class b3_4_Task {
//    public static void main(String[] args) {
//        printConversion(4.213);
//        printConversion(-10);
//        printConversion(0);
//        System.out.println(Math.round(1_609.344));
//    }
//
//    public static long toMilesPerHour(double kilometersPerHour) {
//        if (kilometersPerHour >= 0)
//            return Math.round(kilometersPerHour / 1_609.344);
//        return -1;
//    }
//
//    public static void printConversion(double kilometersPerHour) {
//        if (kilometersPerHour < 0) {
//            System.out.println("Invalid value");
//        } else
//            System.out.println(toMilesPerHour(kilometersPerHour) + " km/h = " + kilometersPerHour + " mi/h");
//    }
//}
////23