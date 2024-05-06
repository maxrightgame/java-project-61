package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int TOTAL_GAMES = 3;
    public static final int EVENGAME_MAX_NUMBER = 100;
    public static final int CALCULATORGAME_MAX_NUMBER = 100;
    public static boolean lose = false;
    public static int winCounter = 0;
    public static String playerName;

    public static String nameReader() {
        System.out.println("Welcome to the Brain Games!\nWhat do I call you?");
        Scanner nameScanner = new Scanner(System.in);
        playerName = nameScanner.next();
        return playerName;
    }

    public static void Greeting(String playerName) {
        System.out.println("Hello, " + playerName + "!");
    }
    
    public static void correctAnswerAction() {
        System.out.println("Correct!");
        winCounter++;
    }

    public static void incorrectAnswerAction(String answer) {
        System.out.println(answer + " is wrong answer ;(. Correct answer was +"); //TODO
        lose = true;
    }

    public static String readPlayerInput() {
        System.out.println("Question: "); //TODO
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
