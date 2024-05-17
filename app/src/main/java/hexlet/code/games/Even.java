package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final int MENU_POSITION = 2;
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int EVENGAME_MIN_NUMBER = 1;
    public static final int EVENGAME_MAX_NUMBER = 100;

    public static void evenGame() {
        System.out.println(RULES);
        while (!Engine.checkWinStatus()) {
            int questionNumber = Utils.generateRandomNumber(EVENGAME_MIN_NUMBER, EVENGAME_MAX_NUMBER);
            Engine.printQuestion(questionNumber);
            String answer = Engine.readPlayerInput();
            if (Engine.compareStringAnswer(answer, isEven(questionNumber))) {
                Engine.correctAnswerAction();
            } else {
                Engine.incorrectAnswerAction(answer, printCorrectAnswer(questionNumber));
            }
        }
    }

    public static boolean isEven(int input) {
        return (input % 2) == 0;
    }

    public static String printCorrectAnswer(int input) {
        return isEven(input) ? "yes" : "no";
    }

}
