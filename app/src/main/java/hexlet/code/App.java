package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static final int EXIT_POSITION = 0;
    public static final int GREETING_POSITION = 1;

    public static void main(String[] args) {
        displayMenu();
        int choice = readInput(); //TODO текст вызовет краш
        if (choice == EXIT_POSITION) {
            System.exit(0);
        } else if (choice == GREETING_POSITION) {
            Engine.greeting(Engine.nameReader());
        } else if (choice == Even.MENU_POSITION) {
            Engine.greeting(Engine.nameReader());
            Even.evenGame();
        } else if (choice == Calculator.MENU_POSITION) {
            Engine.greeting(Engine.nameReader());
            Calculator.calculatorGame();
        } else if (choice == GCD.MENU_POSITION) {
            Engine.greeting(Engine.nameReader());
            GCD.gcdGame();
        } else if (choice == Progression.MENU_POSITION) {
            Engine.greeting(Engine.nameReader());
            Progression.progressionGame();
        } else if (choice == PrimeNumber.MENU_POSITION) {
            Engine.greeting(Engine.nameReader());
            PrimeNumber.primeNumberGame();
        } else {
            System.out.println("Incorrect input!");
        }
    }

    public static void displayMenu() {
        System.out.println("Please enter the action number to start.");
        System.out.println(GREETING_POSITION + " - Greeting");
        System.out.println(Even.MENU_POSITION + " - Even numbers");
        System.out.println(Calculator.MENU_POSITION + " - Calc");
        System.out.println(GCD.MENU_POSITION + " - GCD");
        System.out.println(Progression.MENU_POSITION + " - Progression");
        System.out.println(PrimeNumber.MENU_POSITION + " - Prime");
        System.out.println("0 - Exit");
    }

    public static int readInput() {
        Scanner gameScanner = new Scanner(System.in);
        return Integer.parseInt(gameScanner.next());
    }
}
