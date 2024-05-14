package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static final int MENU_POSITION = 2;
    public static final String RULES = "Answer \"yes\" if the number is even, otherwise answer \"no\".";

    public static void evenGame() {
<<<<<<< HEAD
        Engine.printRules(RULES);
=======
        System.out.println(RULES);
>>>>>>> 4276972c7f1930512e6639020a0f3cf3e64da505
        while (!Engine.checkWinStatus()) {
            int questionNumber = Engine.evenGameGenerateNumber();
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
