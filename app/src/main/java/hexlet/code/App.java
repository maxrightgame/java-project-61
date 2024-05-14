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
        int choice = readInput(); //TODO текст вызовет краш
        switch (choice) {
            case (Engine.EXIT_POSITION):
                break;
            case (Engine.GREETING_POSITION):
                Engine.greeting(Engine.nameReader()); //TODO неясно как убрать это дублирование
                break;
            case (Even.MENU_POSITION):
                Engine.greeting(Engine.nameReader());
                Even.evenGame();
                break;
            case (Calculator.MENU_POSITION):
                Engine.greeting(Engine.nameReader());
                Calculator.calculatorGame();
                break;
            case (GCD.MENU_POSITION):
                Engine.greeting(Engine.nameReader());
                GCD.gcdGame();
                break;
            case (Progression.MENU_POSITION):
                Engine.greeting(Engine.nameReader());
                Progression.progressionGame();
                break;
            case (PrimeNumber.MENU_POSITION):
                Engine.greeting(Engine.nameReader());
                PrimeNumber.primeNumberGame();
                break;
            default:
                System.out.println("Incorrect input!");
                break;
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
