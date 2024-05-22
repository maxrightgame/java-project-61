package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int TOTAL_GAMES = 3;
    public static final int TOTAL_GAME_DATA = 2;

    public static void runGame(String rules, String[][] questionAnswer) {
        String playerName = getPlayerNameAndGreetThem();
        System.out.println(rules);
        int counter = 0;
        for (int i = 0; i < TOTAL_GAMES; i++) {
            System.out.println("Question: " + questionAnswer[counter][0]);
            String answer = readPlayerInput();
            if (answer.equals(questionAnswer[counter][1])) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + questionAnswer[counter][1]
                        + "\nLet's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }

    public static String getPlayerNameAndGreetThem() { // выведен в метод потому что используется в App
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner nameScanner = new Scanner(System.in);
        String playerName = nameScanner.next();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }

    public static String readPlayerInput() {
        Scanner playerInput = new Scanner(System.in);
        return playerInput.next();
    }

}
