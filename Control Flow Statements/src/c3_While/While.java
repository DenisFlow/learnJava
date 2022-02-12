package c3_While;

public class While {
//    public static void main(String[] args) {
//        Task();
//        DoLoop();
//        Task2();
//        Task3();
//        c3_1_Task.voidTask();
//    }
    /*
    Modify the while code above
Make it also record the total
number of even numbers it has found
and break once 5 are found and at the end,
display the total number of even numbers found
    */

    public static void Task3(){
        int number = 4;
        int finishNumber = 20;
        int totalCount = 0;
        int totalSum = 0;

        while (number <= finishNumber){
            number++;
            if (isEvenNumber(number)) {
                totalSum += number;
                System.out.println("Even number " + number);
                if (++totalCount >= 5)
                    break;
            }
        }
        System.out.println("Sum of even number " + totalSum);

    }




    /*
    Create a method called isEvenNumber that takes a parameter of type int
     Its purpose is to determine if the argument passed to the method is
      an even number or not.
       return true if an even number, otherwise return false,'|
    */

    public static void Task2(){
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }

    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void DoLoop(){
        int count = 0;
        do {
            System.out.println(count++);
        } while (count < 5);
    }

    public static void Task(){
        int count = 0;
        while ( count <= 5 ) {
            System.out.println(count);
            count++;
        }
        System.out.println("=====================================");
        for (count = 0; count <= 5; count++){
            System.out.println(count);
        }

        count = 0;
        while (true) {
            if (count >= 6)
                break;
            System.out.println(count);
            count++;
        }
    }
}
