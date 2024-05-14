package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {
    public static void calculatorGame() {
        while (Engine.winCounter < Engine.TOTAL_GAMES && !Engine.lose) {
            int[] expression = generateQuestion();
            String operand = operandRandomizer();
            int correctAnswer = calculate(expression, operand);
            System.out.println("Question: " + expression[0] + " " + operand + " " + expression[1]);
            //TODO перенести вывод вопроса в Engine.java
            String answer = Engine.readPlayerInput();
            //TODO ввод текста вылетит в NumberFormatException
            if (Integer.parseInt(answer) == correctAnswer) {
                Engine.correctAnswerAction();
            } else {
                Engine.incorrectAnswerAction(answer, String.valueOf(correctAnswer));
            }
        }
        if (Engine.winCounter >= Engine.TOTAL_GAMES) {
            Engine.winningAction();
        }
    }

    public static String operandRandomizer() {
        String[] operands = new String[]{"+", "-", "*"};
        int random = (int) (Math.random() * operands.length);
        return operands[random];
    }

    public static int calculate(int[] input, String operand) {
        return switch (operand) {
            case ("+") -> input[0] + input[1];
            case ("-") -> input[0] - input[1];
            case ("*") -> input[0] * input[1];
            default -> 0;
        };
    }

    public static int[] generateQuestion() {
        int[] expression = new int[2];
        for (int i = 0; i < expression.length; i++) {
            expression[i] = Engine.calculatorGameGenerateNumber();
        }
        return expression;
    }
}
