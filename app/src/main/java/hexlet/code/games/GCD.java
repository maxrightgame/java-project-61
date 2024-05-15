package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static final int MENU_POSITION = 4;

    public static void gcdGame() {
        while (!Engine.checkWinStatus()) {
            int[] expression = generateQuestion();
            int correctAnswer = calculateGCD(expression[0], expression[1]);
            System.out.println("Question: " + expression[0] + " " + expression[1]);
            //TODO не понял как сделать универсальный вывод через Engine
            String answer = Engine.readPlayerInput();
            //TODO ввод текста вылетит в NumberFormatException, как обработать?
            if (Integer.parseInt(answer) == correctAnswer) {
                Engine.correctAnswerAction();
            } else {
                Engine.incorrectAnswerAction(answer, String.valueOf(correctAnswer));
            }
        }
    }

    //TODO слишком часто выпадает простое число (делится на себя и 1)
    public static int[] generateQuestion() {
        int[] expression = new int[2];
        for (int i = 0; i < expression.length; i++) {
            expression[i] = Engine.gcdGameGenerateNumber();
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
