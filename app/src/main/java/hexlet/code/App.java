package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

public class App {
    public static final int EXIT_POSITION = 0;
    public static final int GREETING_POSITION = 1;

    public static void main(String[] args) {
        displayMenu();
        int choice = Integer.parseInt(Engine.readPlayerInput()); //TODO текст вызовет краш
        switch (choice) {
            case EXIT_POSITION -> System.exit(0);
            case GREETING_POSITION -> Engine.getPlayerNameAndGreetThem();
            case Even.MENU_POSITION -> Even.startEvenGame();
            case Calculator.MENU_POSITION -> Calculator.startCalculatorGame();
            case GCD.MENU_POSITION -> GCD.startGCDGame();
            case Progression.MENU_POSITION -> Progression.runProgressionGame();
            case PrimeNumber.MENU_POSITION -> PrimeNumber.startPrimeGame();
            default -> System.out.println("Incorrect input!");
        }
    }

    public static void displayMenu() {
        System.out.print("Please enter the action number to start.\n"
                + GREETING_POSITION + " - Greeting\n" + Even.MENU_POSITION + " - Even numbers\n"
                + Calculator.MENU_POSITION + " - Calc\n" + GCD.MENU_POSITION + " - GCD\n"
                + Progression.MENU_POSITION + " - Progression\n" + PrimeNumber.MENU_POSITION + " - Prime\n"
                + "0 - Exit\n");
    }
}
