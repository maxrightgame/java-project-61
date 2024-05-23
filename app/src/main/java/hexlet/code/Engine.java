package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int TOTAL_GAMES = 3;
    public static final int TOTAL_GAME_DATA = 2;

    public static void runGame(String rules, String[][] questionAnswer) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner playerInput = new Scanner(System.in);
        String playerName = playerInput.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(rules);
        int counter = 0;
        for (int i = 0; i < TOTAL_GAMES; i++) {
            System.out.println("Question: " + questionAnswer[counter][0]);
            String answer = playerInput.next();
            if (answer.equals(questionAnswer[counter][1])) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.printf("%s is wrong answer ;(. Correct answer was %s.%nLet's try again, %s!%n",
                        answer, questionAnswer[counter][1], playerName);
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }

}
