package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void progressionGame() {
        while (Engine.winCounter < Engine.TOTAL_GAMES && !Engine.lose) {
            int[] questionArray = new int[generateLength()];
            int questionArrayLength = questionArray.length;
            questionArray[0] = generateQuestion();
            int questionStep = generateStep();
            for (int i = 1; i < questionArrayLength; i++) {
                questionArray[i] = questionArray[i - 1] + questionStep;
            }
            int questionPosition = selectQuestionPosition(questionArrayLength);
            int question = questionArray[questionPosition];
            printQuestionArray(questionArray, questionPosition);
            String answer = Engine.readPlayerInput();
            //TODO ввод текста вылетит в NumberFormatException
            if (Integer.parseInt(answer) == question) {
                Engine.correctAnswerAction();
            } else {
                Engine.incorrectAnswerAction(answer, String.valueOf(question));
                System.out.println(question);
            }
            if (Engine.winCounter >= Engine.TOTAL_GAMES) {
                Engine.winningAction();
            }
        }
    }

    public static int generateQuestion() {
        return (int) (Math.random()
                * (Engine.PROGRESSIONGAME_MAX_NUMBER - Engine.PROGRESSIONGAME_MIN_NUMBER)
                + Engine.PROGRESSIONGAME_MIN_NUMBER);

    }

    public static int generateLength() {
        return (int) (Math.random()
                * (Engine.PROGRESSIONGAME_MAX_LENGTH - Engine.PROGRESSIONGAME_MIN_LENGTH)
                + Engine.PROGRESSIONGAME_MIN_LENGTH);
    }

    public static int generateStep() {
        return (int) (Math.random() * 4) + 1;
    }

    public static int selectQuestionPosition(int arrayLength) {
        return (int) (Math.random() * arrayLength);
    }

    //TODO перенести логику в Engine?
    public static void printQuestionArray(int[] array, int questionPosition) {
        for (int i = 0; i < array.length; i++) {
            if (i == questionPosition) {
                System.out.print("... ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
