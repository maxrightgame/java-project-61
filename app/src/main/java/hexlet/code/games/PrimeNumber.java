package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeNumber {

    public static final int MENU_POSITION = 6;
    public static final String RULES = "Answer \"yes\" if the number is even, otherwise answer \"no\".";

    public static void primeNumberGame() {
<<<<<<< HEAD
        Engine.printRules(RULES);
=======
<<<<<<< HEAD
        Engine.printRules(RULES);
=======
        System.out.println(RULES);
>>>>>>> 4276972c7f1930512e6639020a0f3cf3e64da505
>>>>>>> ee3cf61da2d153e37ee0fb5533afba917d5e93d5
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
