package f1_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }
//    public static void main(String[] args) {
////        chalenge();
//        testArray();
//
//    }

    public static void testArray() {
        int[] arr1 = new int[1];
        Array arr2 = new Array();
        System.out.println(arr1.getClass().toString());
        System.out.println(arr2.getClass().toString());
    }
    /*
  Create a program using arrays that sorts a list of integers in descending order.
Descending order is highest value to lowest.
In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
ultimately have an array with 106,81,26, 15, 5 in it.
Set up the program so that the numbers to sort are read in from the keyboard.
Implement the following methods - getlntegers, printArray, and sortintegers getlntegers
returns an array of entered integers from keyboard printArray prints out the contents
of the array and sortintegers should sort the array and return a new array containing the
sorted numbers you will have to figure out how to copy the array elements from the passed
array into a new array and sort them and return the new sorted array.
    */
    public static void chalenge() {
        int[] arrOld = getlntegers();
        printArray(arrOld, "Your old array");

        int[] arrNew = sortintegers(arrOld);
        printArray(arrNew, "Your new array");

        int[] one = Arrays.copyOf(arrNew, arrNew.length);

    }

    public static int[] sortintegers(int[] oldArray) {
        int[] newArray = new int[oldArray.length];
        int n = oldArray.length;
        Arrays.sort(oldArray);
        for (int i = 0; i < n; i++) {
            newArray[i] = oldArray[n-i-1];
        }

        return newArray;
    }

    public static void printArray(int[] array, String text) {
        System.out.println(text);
        for (int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] getlntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print size of array");
        int sizeArray = 0;
        int realNumbersInArray = 0;
        if (scanner.hasNextInt()) {
            sizeArray = scanner.nextInt();
        }
        int[] arrayInt = new int[sizeArray];
        while (realNumbersInArray < sizeArray) {
            System.out.println("Print next value # " + (realNumbersInArray + 1));
            if (scanner.hasNextInt()) {
                arrayInt[realNumbersInArray] = scanner.nextInt();
                realNumbersInArray++;
            } else
                System.out.println("Invalid number");
            scanner.nextLine();
        }
        return arrayInt;
    }



    public static void testFunction(){
        int[] arr = getIntegers(5);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Average is " + calculateAverage(arr));
    }

    public static double calculateAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        sum /= arr.length;
        return sum;
    }

    static public int[] getIntegers(int num) {
        int[] arr = new int[num];
        int count = 0;
        while (++count <= num) {
            System.out.println("Print next value\r");
            if (scanner.hasNextInt()) {
                arr[count - 1] = scanner.nextInt();
            }

            scanner.nextLine();

        }

        return arr;
    }
}
