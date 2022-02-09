package b3_IfKeywordsAndCodeBlocks;

/*
Print out a second score on the screen with the following
score set to 10000
levelCompleted set to 8
bonus set to 200
But make sure the first printout above still displays as well
*/

public class b3_1_Task {
    public static void main(String[] args) {
        int highScore;
        highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);
        highScore = calculateScore(true, 1000, 8, 200);
        System.out.println("Your final score was " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else
            return -1;

    }
}
