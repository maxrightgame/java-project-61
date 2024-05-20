package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {

    public static final String RULES = "What is the result of the expression?";
    public static final int CALCULATORGAME_MIN_NUMBER = 1;
    public static final int CALCULATORGAME_MAX_NUMBER = 15;

    public static void startCalculatorGame() {
        int gamesTotal = Engine.TOTAL_GAMES;
        int dataTotal = Engine.TOTAL_GAME_DATA;
        String[][] questionAnswerArray = new String[gamesTotal][dataTotal];
        for (int i = 0; i < gamesTotal; i++) {
            int number1 = Utils.generateRandomNumber(CALCULATORGAME_MIN_NUMBER, CALCULATORGAME_MAX_NUMBER);
            int number2 = Utils.generateRandomNumber(CALCULATORGAME_MIN_NUMBER, CALCULATORGAME_MAX_NUMBER);
            String operand = randomizeOperand();
            questionAnswerArray[i][0] = number1 + " " + operand + " " + number2;
            questionAnswerArray[i][1] = String.valueOf(calculate(number1, number2, operand));
        }
        Engine.runGame(RULES, questionAnswerArray);
    }

    public static String randomizeOperand() {
        String[] operands = new String[]{"+", "-", "*"};
        int random = (int) (Math.random() * operands.length);
        return operands[random];
    }

    public static int calculate(int input1, int input2, String operand) {
        return switch (operand) {
            case ("+") -> input1 + input2;
            case ("-") -> input1 - input2;
            case ("*") -> input1 * input2;
            default -> 0;
        };
    }
}
