package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final String RULES = "What number is missing in the progression?";
    public static final int PROGRESSIONGAME_MIN_STEP_NUMBER = 1;
    public static final int PROGRESSIONGAME_MAX_STEP_NUMBER = 4;
    public static final int PROGRESSIONGAME_MIN_NUMBER = 1;
    public static final int PROGRESSIONGAME_MAX_NUMBER = 100;
    public static final int PROGRESSIONGAME_MIN_LENGTH = 7;
    public static final int PROGRESSIONGAME_MAX_LENGTH = 14;

    public static void runProgressionGame() {
        int gamesTotal = Engine.TOTAL_GAMES;
        int dataTotal = Engine.TOTAL_GAME_DATA;
        String[][] questionAnswerArray = new String[gamesTotal][dataTotal];
        for (int i = 0; i < gamesTotal; i++) {
            int length = Utils.generateRandomNumber(PROGRESSIONGAME_MIN_LENGTH, PROGRESSIONGAME_MAX_LENGTH);
            int step = Utils.generateRandomNumber(PROGRESSIONGAME_MIN_STEP_NUMBER, PROGRESSIONGAME_MAX_STEP_NUMBER);
            int startNumber = Utils.generateRandomNumber(PROGRESSIONGAME_MIN_NUMBER, PROGRESSIONGAME_MAX_NUMBER);
            int[] progression = generateQuestionArray(length, step, startNumber);
            int secretSpot = Utils.generateRandomNumber(0, progression.length);
            int secretSpotValue = progression[secretSpot];
            String[] secretProgression = swapSecretSpot(progression, secretSpot);
            questionAnswerArray[i][0] = String.join(" ", secretProgression);
            questionAnswerArray[i][1] = String.valueOf(secretSpotValue);

        }
        Engine.runGame(RULES, questionAnswerArray);
    }

    public static int[] generateQuestionArray(int length, int step, int startNumber) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = startNumber + step * i;
        }
        return array;
    }

    public static String[] swapSecretSpot(int[] array, int secretSpot) {
        String[] output = new String[array.length];
        for (int i = 0; i < output.length; i++) {
            if (i == secretSpot) {
                output[i] = "..";
            } else {
                output[i] = String.valueOf(array[i]);
            }
        }
        return output;
    }
}
