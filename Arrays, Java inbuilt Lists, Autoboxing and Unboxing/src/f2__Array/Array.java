package f2__Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
/*
Write a method called reverse() with an int array as a parameter.
The method should not return any value. In other words, the method is allowed to modify the array parameter.
In main() test the reverse() method and print the array both reversed and nonreversed.
To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
For example, if the array is {1,2, 3,4, 5}, then the reversed array is {5,4, 3, 2,1}.
Tip:
• Create a new console project with the name 'ReverseArrayChallenge'
    */
    public static void main(String[] args) {
        int[] arr = {1,34, 45, 23, 56, 12, 34};
        int[] newArr = reversed(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));

    }

    public static int[] reversed(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - i - 1];
        }

        return newArray;
    }

    /*
  Write a method called readlntegers() with a parameter called count that represents how many integers the user needs to enter.
The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
In the main() method read the count from the console and call the method readlntegersQ with the count parameter.
Then call the findMin() method passing the array returned from the call to the readlntegersQ method.
Finally, print the minimum element in the array.
Tips:
•	Assume that the user will only enter numbers, never letters
•	For simplicity, create a Scanner as a static field to help with data input
•	Create a new console project with the name 'MinElementChallenge'
    */
//    public static void main(String[] args) {
//        int[] arr = readIntegers();
//        int min = findMin(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(min);
//    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = array[i] > min? min: array[i];
        }

        return min == Integer.MAX_VALUE? null: min;
    }

    public static int[] readIntegers() {
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


//    public static void main(String[] args) {
//        int myIntValue = 10;
//        int anotherIntValue = myIntValue;
//
//        System.out.println("myIntValue " + myIntValue);
//        System.out.println("anotherIntValue " + anotherIntValue);
//
//        anotherIntValue++;
//        System.out.println("myIntValue " + myIntValue);
//        System.out.println("anotherIntValue " + anotherIntValue);
//
//        int[] arr1 = new int[2];
//        int[] arr2 = arr1;
//
//        System.out.println("arr1 " + Arrays.toString(arr1));
//        System.out.println("arr2 " + Arrays.toString(arr2));
//
//        arr1[1] = 123;
//
//        System.out.println("arr1 " + Arrays.toString(arr1));
//        System.out.println("arr2 " + Arrays.toString(arr2));
//
//        arr1 = new int[] {123,43234,123132,123};
//        modifyArray(arr1);
//
//        System.out.println("arr1 " + Arrays.toString(arr1));
//        System.out.println("arr2 " + Arrays.toString(arr2));
//
//    }

    public static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5, 6, 45};
    }
}
