package c5_Scanner;

import java.util.Scanner;

public class Scanner_project {
    public static void main(String[] args) {
//        getDataAndOutput();
//        readNumbers();
        MinAndMaxInputChallenge();
    }


    public static void getDataAndOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your name");

        String name = scanner.nextLine();

        System.out.println("Enter your year of birth");

        boolean hasNextInt = scanner.hasNextInt();
        Integer year = Integer.parseInt(scanner.nextLine());
        Integer yearNow = 2022;
        Integer age = yearNow - year;
        if (!hasNextInt || age < 0 || age > 100) {
            System.out.println("Invalid year of birth");
            return;
        }
        System.out.println(name + " " + age);
        scanner.close();

    }


    /*
    Read 10 numbers from the console entered by the user and print the sum of those numbers.
Create a Scanner like we did in the previous video.
Use the hasNextlntQ method from the scanner to check if the user has entered an int value.
If hasNextlntQ returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers.
Use the nextlntQ method to get the number and add it to the sum.

Before the user enters each number, print the message "Enter number #x:" where x represents the count, i.e. 1, 2, 3, 4, etc.
For example, the first message printed to the user would be "Enter number #1the next "Enter number #2:", and so on.
Hint:
    Use a while loop.
    Use a counter variable for counting valid numbers.
    Close the scanner after you don't need it anymore.
    Create a project with the name ReadingUserlnputChallenge.

    */

    public static void readNumbers() {
        int counterNumbers = 1;
        String numbersString = "";
        int sumOfNumbers = 0;
        Scanner scanner = new Scanner(System.in);

        while (counterNumbers <= 10) {
            System.out.println("Enter number #" + counterNumbers + ":");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sumOfNumbers += number;
                numbersString += " " + number;
                counterNumbers++;
            } else
                System.out.println("Invalid int");

            scanner.nextLine();


        }
        scanner.close();

        System.out.println("Sum of numbers " + numbersString + " is " + sumOfNumbers);
    }
    /*
Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
Before the user enters the number, print the message "Enter number:"
If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
•	Use an endless while loop.
Bonus:
•	Create a project with the name MinAndMaxInputChallenge.
*/
    public static void MinAndMaxInputChallenge() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        while (true){
            System.out.println("Enter number:");
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                if (max < number)
                    max = number;
                if (min > number)
                    min = number;

                scanner.nextLine();
            }else
                break;
        }
        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE)
            System.out.println("Numbers wasn't written");
        else
            System.out.println("min number is " + min + " max number is " + max);
        scanner.close();
    }
}

