package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }
}
