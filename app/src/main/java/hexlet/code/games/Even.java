package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static final int MENU_POSITION = 2;

    public static void evenGame() {
        System.out.println("Answer \"yes\" if the number is even, otherwise answer \"no\".");
        while (Engine.winCounter < Engine.TOTAL_GAMES && !Engine.lose) {
            int questionNumber = Engine.evenGameGenerateNumber();
            Engine.printQuestion(questionNumber);
            String answer = Engine.readPlayerInput();
            if (Engine.compareStringAnswer(answer, isEven(questionNumber))) {
                Engine.correctAnswerAction();
            } else {
                Engine.incorrectAnswerAction(answer, printCorrectAnswer(questionNumber));
                //TODO не разобрался как перевести на рельсы Engine.java
            }
        }
        if (Engine.winCounter >= Engine.TOTAL_GAMES) {
            Engine.printWinningCommends();
        }
    }

    public static boolean isEven(int input) {
        return (input % 2) == 0;
    }

    public static String printCorrectAnswer(int input) {
        return isEven(input) ? "yes" : "no";
    }

}
