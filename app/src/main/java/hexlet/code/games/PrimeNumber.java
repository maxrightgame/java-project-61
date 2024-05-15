package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeNumber {

    public static final int MENU_POSITION = 6;
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void primeNumberGame() {
        Engine.printRules(RULES);
        while (!Engine.checkWinStatus()) {
            int question = Engine.primeNumberGameGenerateNumber();
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
