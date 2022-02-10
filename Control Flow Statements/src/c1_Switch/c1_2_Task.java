package c1_Switch;


/*
Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
The method should not return any value (hint: void)
Using a switch statement print "Sunday", "Monday",... /'Saturday" if the int parameter "day" is 0,1,..., 6 respectively, otherwise it should print "Invalid day".
Bonus:
•	Write a second solution using if then else, instead of using switch.
•	Create a new project in Intellij with the name "DayOfTheWeekChallenge"


*/

public class c1_2_Task {
    public static void Task_2(){
        printDayOfWeak(1);
        DayOfWeekChallenge(2);
    }

    public static void printDayOfWeak(int day){
        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void DayOfWeekChallenge(int day){
        if (day == 0){
            System.out.println("Monday");
        } else if (day == 1){
            System.out.println("Tuesday");
        } else if (day == 2){
            System.out.println("Wednesday");
        } else if (day == 3){
            System.out.println("Thursday");
        } else if (day == 4){
            System.out.println("Friday");
        } else if (day == 5){
            System.out.println("Saturday");
        } else if (day == 6){
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
