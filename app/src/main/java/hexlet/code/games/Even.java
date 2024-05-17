package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final int MENU_POSITION = 2;
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int EVENGAME_MIN_NUMBER = 1;
    public static final int EVENGAME_MAX_NUMBER = 100;

    /* String[][] = {1, 2, 3},
                    {no, yes, no}
    */


    public static void startEvenGame() {
        int gamesTotal = Engine.TOTAL_GAMES;
        int dataTotal = Engine.TOTAL_GAME_DATA;
        String[][] questionAnswerArray = new String[gamesTotal][dataTotal];
        for (int i = 0; i < gamesTotal; i++) {
            int question = Utils.generateRandomNumber(EVENGAME_MIN_NUMBER, EVENGAME_MAX_NUMBER);
            questionAnswerArray[i][0] = String.valueOf(question);
            questionAnswerArray[i][1] = printCorrectAnswer(question);
        }
        Engine.runGame(RULES, questionAnswerArray);
    }

    public static boolean isEven(int input) {
        return (input % 2) == 0;
    }

    public static String printCorrectAnswer(int input) {
        return isEven(input) ? "yes" : "no";
    }

    public static boolean compareStringAnswer(String answer, boolean question) {
        return question && answer.equals("yes") || !question && answer.equals("no");
    }
}
