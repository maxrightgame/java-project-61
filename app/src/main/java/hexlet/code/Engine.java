package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int TOTAL_GAMES = 3;
    public static final int EVENGAME_MAX_NUMBER = 100;
    public static final int CALCULATORGAME_MAX_NUMBER = 15;
    public static final int GCDGAME_MAX_NUMBER = 60;
    public static final int PROGRESSIONGAME_MIN_NUMBER = 1;
    public static final int PROGRESSIONGAME_MAX_NUMBER = 100;
    public static final int PROGRESSIONGAME_MIN_LENGTH = 7;
    public static final int PROGRESSIONGAME_MAX_LENGTH = 14;
    public static final int PRIMEGAME_MIN_NUMBER = 1;
    public static final int PRIMEGAME_MAX_NUMBER = 99;
    public static final int EXIT_POSITION = 0;
    public static final int GREETING_POSITION = 1;
    public static boolean lose = false;
    public static int winCounter = 0;
    public static String playerName;

    public static boolean checkWinStatus() {
        if (winCounter < TOTAL_GAMES && !lose) {
            return false;
        } else if (lose) {
            return true;
        } else {
            System.out.println("Congratulations, " + playerName + "!");
            return true;
        }
    }

    public static String nameReader() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner nameScanner = new Scanner(System.in);
        playerName = nameScanner.next();
        return playerName;
    }

    public static void greeting(String inputPlayerName) {
        System.out.println("Hello, " + inputPlayerName + "!");
    }

    public static void printQuestion(int input) { //
        System.out.println("Question: " + input);
    }

    public static void correctAnswerAction() {
        System.out.println("Correct!");
        winCounter++;
    }

    public static void incorrectAnswerAction(String answer, String correctAnswer) {
        System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
        lose = true;
    }

    public static boolean compareStringAnswer(String answer, boolean question) {
        return question && answer.equals("yes") || !question && answer.equals("no");
    }

    public static String readPlayerInput() {
        Scanner playerInput = new Scanner(System.in);
        return playerInput.next();
    }

    public static int evenGameGenerateNumber() {
        return (int) (Math.random() * Engine.EVENGAME_MAX_NUMBER);
    }

    public static int primeNumberGameGenerateNumber() {
        return (int) (Math.random()
                * (Engine.PRIMEGAME_MAX_NUMBER - Engine.PRIMEGAME_MIN_NUMBER)
                + Engine.PRIMEGAME_MIN_NUMBER);
    }

    public static int calculatorGameGenerateNumber() {
        return (int) (Math.random() * Engine.CALCULATORGAME_MAX_NUMBER);
    }

    public static int gcdGameGenerateNumber() {
        return (int) (Math.random() * Engine.GCDGAME_MAX_NUMBER);
    }

    public static void printRules(String rules) {
        System.out.println(rules);
    }
}
