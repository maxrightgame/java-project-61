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
    public static final int PRIMEGAME_MAX_STEP_NUMBER = 4;
    public static final int EXIT_POSITION = 0;
    public static final int GREETING_POSITION = 1;
    private static boolean lose = false;
    private static int winCounter = 0;
    private static String playerName;

    public static boolean getLose() {
        return lose;
    }

    public static void setLose(boolean input) {
        lose = input;
    }

    public static int getWinCounter() {
        return winCounter;
    }

    public static void increaseWinCounter() {
        winCounter += 1;
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String playerNameInput) {
        Engine.playerName = playerNameInput;
    }



    public static boolean checkWinStatus() {
        if (getWinCounter() < TOTAL_GAMES && !getLose()) {
            return false;
        } else if (getLose()) {
            return true;
        } else {
            System.out.println("Congratulations, " + getPlayerName() + "!");
            return true;
        }
    }

    public static String nameReader() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner nameScanner = new Scanner(System.in);
        setPlayerName(nameScanner.next());
        return getPlayerName();
    }

    public static void greeting(String inputPlayerName) {
        System.out.println("Hello, " + inputPlayerName + "!");
    }

    public static void printQuestion(int input) { //
        System.out.println("Question: " + input);
    }

    public static void correctAnswerAction() {
        System.out.println("Correct!");
        increaseWinCounter();
    }

    public static void incorrectAnswerAction(String answer, String correctAnswer) {
        System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
        setLose(true);
        System.out.println("Let's try again, " + getPlayerName() + "!");
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
