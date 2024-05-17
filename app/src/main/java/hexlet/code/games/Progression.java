package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final int MENU_POSITION = 5;
    public static final String RULES = "What number is missing in the progression?";
    public static final int PROGRESSIONGAME_MIN_STEP_NUMBER = 1;
    public static final int PROGRESSIONGAME_MAX_STEP_NUMBER = 4;
    public static final int PROGRESSIONGAME_MIN_NUMBER = 1;
    public static final int PROGRESSIONGAME_MAX_NUMBER = 100;
    public static final int PROGRESSIONGAME_MIN_LENGTH = 7;
    public static final int PROGRESSIONGAME_MAX_LENGTH = 14;

    public static void progressionGame() {
        System.out.println(RULES);
        while (!Engine.checkWinStatus()) {
            int length = Utils.generateRandomNumber(PROGRESSIONGAME_MIN_LENGTH, PROGRESSIONGAME_MAX_LENGTH);
            int[] questionArray = new int[length];
            int questionArrayLength = questionArray.length;
            questionArray[0] = Utils.generateRandomNumber(PROGRESSIONGAME_MIN_NUMBER, PROGRESSIONGAME_MAX_NUMBER);
            int questionStep = Utils.generateRandomNumber(PROGRESSIONGAME_MIN_STEP_NUMBER,
                    PROGRESSIONGAME_MAX_STEP_NUMBER);
            for (int i = 1; i < questionArrayLength; i++) {
                questionArray[i] = questionArray[i - 1] + questionStep;
            }
            int questionPosition = selectQuestionPosition(questionArrayLength);
            int question = questionArray[questionPosition];
            printQuestionArray(questionArray, questionPosition);
            String answer = Engine.readPlayerInput();
            //TODO ввод текста вылетит в NumberFormatException, как обработать?
            if (Integer.parseInt(answer) == question) {
                Engine.correctAnswerAction();
            } else {
                Engine.incorrectAnswerAction(answer, String.valueOf(question));
            }
        }
    }

    public static int selectQuestionPosition(int arrayLength) {
        return (int) (Math.random() * arrayLength);
    }

    public static void printQuestionArray(int[] array, int questionPosition) {
        System.out.print("Question: ");
        for (int i = 0; i < array.length; i++) {
            if (i == questionPosition) {
                System.out.print(".. ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
