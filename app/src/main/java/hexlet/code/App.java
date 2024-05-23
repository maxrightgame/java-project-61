package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        displayMenu();
        Scanner appInput = new Scanner(System.in);
        String choice = appInput.next();
        switch (choice) {
            case "0" -> System.exit(0);
            case "1" -> Cli.greetPlayer();
            case "2" -> Even.startEvenGame();
            case "3" -> Calculator.startCalculatorGame();
            case "4" -> GCD.startGCDGame();
            case "5" -> Progression.runProgressionGame();
            case "6" -> PrimeNumber.startPrimeGame();
            default -> System.out.println("Incorrect input!");
        }
    }

    public static void displayMenu() {
        System.out.print("""
                Please enter the action number to start.
                1 - Greeting
                2 - Even numbers
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
    }
}
