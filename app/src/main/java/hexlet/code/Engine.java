package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int TOTAL_GAMES = 3;
    public static final int TOTAL_GAME_DATA = 2;
    private static boolean lose = false;
    private static int winCounter = 0;
    private static String playerName;

    public static void runGame(String rules, String[][] questionAnswer) {
        getPlayerNameAndGreetThem();
        System.out.println(rules);
        int counter = 0;
        while (winCounter < TOTAL_GAMES && !lose) {
            System.out.println("Question: " + questionAnswer[counter][0]);
            String answer = readPlayerInput();
            if (answer.equals(questionAnswer[counter][1])) {
                System.out.println("Correct!");
                winCounter++;
                counter++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + questionAnswer[counter][1]
                        + "\nLet's try again, " + playerName + "!");
                lose = true;
            }
        }
        if (winCounter >= TOTAL_GAMES) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }

    public static void getPlayerNameAndGreetThem() { // выведен в метод потому что используется в App
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner nameScanner = new Scanner(System.in);
        playerName = nameScanner.next();
        System.out.println("Hello, " + playerName + "!");
    }

    public static String readPlayerInput() {
        Scanner playerInput = new Scanner(System.in);
        return playerInput.next();
    }

}
