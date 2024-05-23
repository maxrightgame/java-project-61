package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {

    public static final String RULES = "What is the result of the expression?";
    public static final int CALCULATORGAME_MIN_NUMBER = 1;
    public static final int CALCULATORGAME_MAX_NUMBER = 15;

    public static void startCalculatorGame() {
        String[] operands = new String[]{"+", "-", "*"};
        int gamesTotal = Engine.TOTAL_GAMES;
        int dataTotal = Engine.TOTAL_GAME_DATA;
        String[][] questionAnswerArray = new String[gamesTotal][dataTotal];
        for (int i = 0; i < gamesTotal; i++) {
            int number1 = Utils.generateRandomNumber(CALCULATORGAME_MIN_NUMBER, CALCULATORGAME_MAX_NUMBER);
            int number2 = Utils.generateRandomNumber(CALCULATORGAME_MIN_NUMBER, CALCULATORGAME_MAX_NUMBER);
            String operand = operands[(Utils.generateRandomNumber(operands.length))];
            questionAnswerArray[i][0] = number1 + " " + operand + " " + number2;
            questionAnswerArray[i][1] = String.valueOf(calculate(number1, number2, operand));
        }
        Engine.runGame(RULES, questionAnswerArray);
    }

    private static int calculate(int input1, int input2, String operand) {
        return switch (operand) {
            case ("+") -> input1 + input2;
            case ("-") -> input1 - input2;
            case ("*") -> input1 * input2;
            default -> 0;
        };
    }
}
