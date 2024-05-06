package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void evenGame() {
        System.out.println("Answer \"yes\" if the number is even, otherwise answer \"no\".");
        while (Engine.winCounter < Engine.TOTAL_GAMES && !Engine.lose) {
            int nextNumber = Engine.evenGameGenerateRandomNumber();
            System.out.println("Question: " + nextNumber);
            String answer = Engine.readPlayerInput();
            if ((isEven(nextNumber) && answer.equals("yes")) || (!isEven(nextNumber)) && answer.equals("no")) {
                Engine.correctAnswerAction();
            } else {
                Engine.incorrectAnswerAction(answer);
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + (isEven(nextNumber) ? "yes" : "no"));
            }
        }
        if (Engine.winCounter >= 3) {
            System.out.println("Congratulations, " + Engine.playerName + "!");
        }
    }

    public static boolean isEven(int input) {
        return (input % 2) == 0;
    }

}
