package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {
    public static void calculatorGame() {
        int[] expression = new int[2];
        for (int i = 0; i < expression.length; i++) {
            expression[i] = Engine.calculatorGameGenerateRandomNumber();
        }

    }

    public static String operandRandomizer() {
        String[] operands = new String[]{"+", "-", "*"};
        int random = (int) (Math.random() * operands.length);
        return operands[random];
    }

//    public static int calculate(String[] input) {
//        return //TODO
//    }
}
