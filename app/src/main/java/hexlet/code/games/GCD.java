package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gcdGame() {
        while (Engine.winCounter < Engine.TOTAL_GAMES && !Engine.lose) {
            int[] expression = generateQuestion();
            int correctAnswer = calculateGCD(expression[0], expression[1]);
            System.out.println("Question: " + expression[0] + ", " + expression[1]);
            //TODO перенести вывод вопроса в Engine.java
            String answer = Engine.readPlayerInput();
            //TODO ввод текста вылетит в NumberFormatException
            if (Integer.parseInt(answer) == correctAnswer) {
                Engine.correctAnswerAction();
            } else {
                Engine.incorrectAnswerAction(answer, String.valueOf(correctAnswer));
            }
        }
        if (Engine.winCounter >= 3) {
            Engine.winningAction();
        }
    }

    public static int[] generateQuestion() {
        int[] expression = new int[2];
        for (int i = 0; i < expression.length; i++) {
            expression[i] = Engine.gcdGameGenerateRandomNumber();
        }
        return expression;
    }

    public static int calculateGCD(int input1, int input2) {
        if (input1 == 0) {
            return input2;
        }
        while (input2 != 0) {
            if (input1 > input2) {
                input1 -= input2;
            } else {
                input2 -= input1;
            }
        }
        return input1;
    }


}
