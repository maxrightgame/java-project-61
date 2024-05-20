package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {

    public static final int MENU_POSITION = 6;
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int PRIMEGAME_MIN_NUMBER = 0;
    public static final int PRIMEGAME_MAX_NUMBER = 99;

    public static void startPrimeGame() {
        int gamesTotal = Engine.TOTAL_GAMES;
        int dataTotal = Engine.TOTAL_GAME_DATA;
        String[][] questionAnswerArray = new String[gamesTotal][dataTotal];
        for (int i = 0; i < gamesTotal; i++) {
            int question = Utils.generateRandomNumber(PRIMEGAME_MIN_NUMBER, PRIMEGAME_MAX_NUMBER);
            questionAnswerArray[i][0] = String.valueOf(question);
            questionAnswerArray[i][1] = isPrime(question) ? "yes" : "no";
        }
        Engine.runGame(RULES, questionAnswerArray);
    }

    public static boolean isPrime(int input) {
        for (int i = 2; i < Math.sqrt(input); i++) {
            if (input == 1 || input == 0) {
                return false;
            }
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
