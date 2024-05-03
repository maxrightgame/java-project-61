package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void evenGame() {
        System.out.println("Welcome to the Brain Games!\nWhat do I call you?");
        Scanner nameScanner = new Scanner(System.in);
        String playerName = nameScanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println("Answer \"yes\" if the number is even, otherwise answer \"no\".");
        int winCounter = 0;
        boolean lose = false;
        boolean isEven;
        Scanner answerScanner = new Scanner(System.in);
        while (winCounter < 3 && !lose) {
            int nextNumber = (int) (Math.random() * 100);
            isEven = (nextNumber % 2) == 0;
            System.out.println("Question: " + nextNumber);
            String answer = answerScanner.next();
            if ((isEven && answer.equals("yes")) || (!isEven) && answer.equals("no")) {
                System.out.println("Correct!");
                winCounter++;
            } else {
                System.out.println(answer + "is wrong answer ;(. Correct answer was " + (isEven ? "yes" : "no"));
                lose = true;
            }
        }
        if (winCounter >= 3) {
            System.out.println("Congratulations, " + playerName + "!");
        }
        nameScanner.close();
    }
}
