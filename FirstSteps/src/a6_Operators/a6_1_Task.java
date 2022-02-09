package a6_Operators;

//Let's test what you have learned about Operators.
//        1.	Create a double variable with a value of 20.00.
//        2.	Create a second variable of type double with the value 80.00.
//        3.	Add both numbers together and multiply by 100.00.
//        4.	Use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00. We used the modulus or remainder operator on ints in the course, but we can also use it on a double.
//        5.	Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if its not zero.
//        6.	Output the boolean variable.
//        7.	Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true. Don't be surprised if you see output for this step, where you might expect it not to show. I'll explain it in my solution.

public class a6_1_Task {
    public static void main(String[] args) {
        double firstVariableDouble = 20;
        double secondVariableDouble = 80;
        double result = (firstVariableDouble + secondVariableDouble) * 100;
        int reminderResult = (int)(result % 100.);
        int reminderF = (int)(result % 40.);
        System.out.println("result is " + result);
        System.out.println("reminder is " + reminderResult);
        System.out.println("reminder of 40 is " + reminderF);
        boolean boolResult = reminderResult == 0;
        boolean boolF = reminderF == 0;
        System.out.println("result of boolResult is " + boolResult);
        System.out.println("result of boolF is " + boolF);
        if (!boolResult)
            System.out.println("Got some reminder boolResult");
        if (!boolF)
            System.out.println("Got some reminder boolF");
    }
}
