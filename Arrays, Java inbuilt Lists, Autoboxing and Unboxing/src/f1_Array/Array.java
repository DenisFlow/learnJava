package f1_Array;

import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
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
