package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int TOTAL_GAMES = 3;
    public static final int EVENGAME_MAX_NUMBER = 100;
    public static final int CALCULATORGAME_MAX_NUMBER = 15;
    public static boolean lose = false;
    public static int winCounter = 0;
    public static String playerName;

    public static String nameReader() {
        System.out.println("Welcome to the Brain Games!\nWhat do I call you?");
        Scanner nameScanner = new Scanner(System.in);
        playerName = nameScanner.next();
        return playerName;
    }

    public static void greeting(String inputPlayerName) {
        System.out.println("Hello, " + inputPlayerName + "!");
    }

    public static void evenGamePrintQuestion(int input) {
        System.out.println("Question: " + input);
    }

    public static void correctAnswerAction() {
        System.out.println("Correct!");
        winCounter++;
    }

    public static void incorrectAnswerAction(String answer) {
        System.out.print(answer + " is wrong answer ;(. Correct answer was " + answer);
        //TODO нужно закрыть сканер после поражения
        lose = true;
    }

    public static void winningAction() {
        System.out.println("Congratulations, " + Engine.playerName + "!"); //TODO нужно закрыть сканер после победы
    }

    public static String readPlayerInput() {
        Scanner playerInput = new Scanner(System.in);
        return playerInput.next();
    }

    public static int evenGameGenerateRandomNumber() {
        return (int) (Math.random() * Engine.EVENGAME_MAX_NUMBER);
    }

    public static int calculatorGameGenerateRandomNumber() {
        return (int) (Math.random() * Engine.CALCULATORGAME_MAX_NUMBER);
    }
}
