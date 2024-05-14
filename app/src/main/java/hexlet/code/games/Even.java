package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void evenGame() {
        System.out.println("Answer \"yes\" if the number is even, otherwise answer \"no\".");
        while (Engine.winCounter < Engine.TOTAL_GAMES && !Engine.lose) {
            int questionNumber = Engine.evenGameGenerateNumber();
            Engine.evenGamePrintQuestion(questionNumber);
            String answer = Engine.readPlayerInput();
            if ((isEven(questionNumber) && answer.equals("yes")) || (!isEven(questionNumber)) && answer.equals("no")) {
                Engine.correctAnswerAction();
            } else {
                Engine.incorrectAnswerAction(answer, printCorrectAnswer(questionNumber));
                //TODO не разобрался как перевести на рельсы Engine.java
            }
        }
        if (Engine.winCounter >= Engine.TOTAL_GAMES) {
            Engine.winningAction();
        }
    }

    public static boolean isEven(int input) {
        return (input % 2) == 0;
    }

    public static String printCorrectAnswer(int input) {
        return isEven(input) ? "yes" : "no";
    }

}
