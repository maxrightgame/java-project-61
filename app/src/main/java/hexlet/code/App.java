package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Even.evenGame;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the action number to start.");
        System.out.println("1 - Greeting");
        System.out.println("2 - Even numbers");
        System.out.println("0 - Exit");
        Scanner gameScanner = new Scanner(System.in);
        int choice = Integer.parseInt(gameScanner.next());
        switch (choice) {
            case (0):
                break;
            case (1):
                System.out.println("Welcome to the Brain Games!\nWhat do I call you?");
                Scanner nameScanner = new Scanner(System.in);
                String playerName = nameScanner.next();
                System.out.println("Hello, " + playerName + "!");
                break;
            case (2):
                evenGame();
                break;
            default:
                System.out.println("Incorrect input!");
                break;
        }
        gameScanner.close();
    }
}
