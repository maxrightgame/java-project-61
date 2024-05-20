package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int EVENGAME_MIN_NUMBER = 1;
    public static final int EVENGAME_MAX_NUMBER = 100;

    public static void startEvenGame() {
        int gamesTotal = Engine.TOTAL_GAMES;
        int dataTotal = Engine.TOTAL_GAME_DATA;
        String[][] questionAnswerArray = new String[gamesTotal][dataTotal];
        for (int i = 0; i < gamesTotal; i++) {
            int question = Utils.generateRandomNumber(EVENGAME_MIN_NUMBER, EVENGAME_MAX_NUMBER);
            questionAnswerArray[i][0] = String.valueOf(question);
            questionAnswerArray[i][1] = isEven(question) ? "yes" : "no";
        }
        Engine.runGame(RULES, questionAnswerArray);
    }

    public static boolean isEven(int input) {
        return (input % 2) == 0;
    }
}
