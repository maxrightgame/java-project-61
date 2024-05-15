package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Engine.greeting(Engine.nameReader());
        displayMenu();
        int choice = readInput(); //TODO текст вызовет краш
        if (choice == Engine.EXIT_POSITION) {
        } else if (choice == Engine.GREETING_POSITION) {
            Engine.greeting(Engine.nameReader()); 
        } else if (choice == Even.MENU_POSITION) {
            Even.evenGame();
        } else if (choice == Calculator.MENU_POSITION) {
            Calculator.calculatorGame();
        } else if (choice == GCD.MENU_POSITION) {
            GCD.gcdGame();
        } else if (choice == Progression.MENU_POSITION) {
            Progression.progressionGame();
        } else if (choice == PrimeNumber.MENU_POSITION) {
            PrimeNumber.primeNumberGame();
        } else {
            System.out.println("Incorrect input!");
        }
    }

    public static void displayMenu() {
        System.out.println("Please enter the action number to start.");
        System.out.println(Engine.GREETING_POSITION + " - Greeting");
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
