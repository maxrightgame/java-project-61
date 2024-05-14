package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeNumber {
    public static void primeNumberGame() {
        System.out.println("Answer \"yes\" if the number is even, otherwise answer \"no\".");
        while (Engine.winCounter < Engine.TOTAL_GAMES && !Engine.lose) {
            int question = Engine.primeNumberGameGenerateNumber();
            System.out.println("Question: " + question);
            String answer = Engine.readPlayerInput();
            if ((isPrime(question) && answer.equals("yes")) || (!isPrime(question)) && answer.equals("no")) {
                Engine.correctAnswerAction();
            } else {
                Engine.incorrectAnswerAction(answer, printCorrectAnswer(question));
            }
        }
        if (Engine.winCounter >= Engine.TOTAL_GAMES) {
            Engine.winningAction();
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
