package b4_Overloading;

public class Overloading {
    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//
//        newScore = calculateScore(1500);
//        System.out.println("New score is " + newScore);
//
//        calculateScore();

//        System.out.println(b4_1_Task.calcFeetAndInchesToCentimeters(10,-1));
//        System.out.println(b4_1_Task.calcFeetAndInchesToCentimeters(-10));

        System.out.println(b4_2_Task.getDurationString(65, 45));
        System.out.println(b4_2_Task.getDurationString(3945));
        System.out.println(b4_2_Task.getDurationString(-1));
    }


    public static int calculateScore(String playerName, int score ){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return  score * 1000;
    }

    public static int calculateScore(int score ){
        System.out.println("Player scored " + score + " points");
        return  score * 1000;
    }

    public static void calculateScore(){
        System.out.println("No player scored here");
     }
}
