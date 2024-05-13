package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        displayMenu();
        Scanner gameScanner = new Scanner(System.in);
        int choice = Integer.parseInt(gameScanner.next());
        switch (choice) {
            case (0):
                break;
            case (1):
                Engine.greeting(Engine.nameReader());
                break;
            case (2):
                Engine.greeting(Engine.nameReader());
                Even.evenGame();
                break;
            case (3):
                Engine.greeting(Engine.nameReader());
                Calculator.calculatorGame();
                break;
            case (4):
                Engine.greeting(Engine.nameReader());
                GCD.gcdGame();
                break;
            case (5):
                Engine.greeting(Engine.nameReader());
                break;
            default:
                System.out.println("Incorrect input!");
                break;
        }
    }

    public static void displayMenu() {
        System.out.println("Please enter the action number to start.");
        System.out.println("1 - Greeting");
        System.out.println("2 - Even numbers");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
    }
}
