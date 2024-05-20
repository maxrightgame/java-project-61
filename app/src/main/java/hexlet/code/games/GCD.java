package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final String RULES = "Find the greatest common divisor of given numbers.";
    public static final int GCDGAME_MIN_NUMBER = 1;
    public static final int GCDGAME_MAX_NUMBER = 60;

    public static void startGCDGame() {
        int gamesTotal = Engine.TOTAL_GAMES;
        int dataTotal = Engine.TOTAL_GAME_DATA;
        String[][] questionAnswerArray = new String[gamesTotal][dataTotal];
        for (int i = 0; i < gamesTotal; i++) {
            int number1 = Utils.generateRandomNumber(GCDGAME_MIN_NUMBER, GCDGAME_MAX_NUMBER);
            int number2 = Utils.generateRandomNumber(GCDGAME_MIN_NUMBER, GCDGAME_MAX_NUMBER);
            String numberCombo = number1 + " " + number2;
            questionAnswerArray[i][0] = numberCombo;
            questionAnswerArray[i][1] = String.valueOf(calculateGCD(number1, number2));
        }
        Engine.runGame(RULES, questionAnswerArray);
    }

    public static int calculateGCD(int input1, int input2) {
        if (input1 == 0) {
            return input2;
        }
        while (input2 != 0) {
            if (input1 > input2) {
                input1 -= input2;
            } else {
                input2 -= input1;
            }
        }
        return input1;
    }
}
