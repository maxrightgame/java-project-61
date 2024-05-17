package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {

    public static final int MENU_POSITION = 6;
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int PRIMEGAME_MIN_NUMBER = 1;
    public static final int PRIMEGAME_MAX_NUMBER = 99;

    public static void primeNumberGame() {
        Engine.printRules(RULES);
        while (!Engine.checkWinStatus()) {
            int question = Utils.generateRandomNumber(PRIMEGAME_MIN_NUMBER, PRIMEGAME_MAX_NUMBER);
            Engine.printQuestion(question);
            String answer = Engine.readPlayerInput();
            if (Engine.compareStringAnswer(answer, isPrime(question))) {
                Engine.correctAnswerAction();
            } else {
                Engine.incorrectAnswerAction(answer, printCorrectAnswer(question));
            }
        }
    }

    public static boolean isPrime(int input) {
        for (int i = 2; i < Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String printCorrectAnswer(int input) {
        return isPrime(input) ? "yes" : "no";
    }

}
