package Menu;
import java.util.InputMismatchException;
import java.util.Scanner;

import Battle.Personalized;
import Battle.Random;
import Utils.Sleep;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void mainMenu(){
        System.out.println("Menu principal");
        System.out.println("1- Start random game.");
        System.out.println("2- Start personalized game.");
        System.out.println("3- View last games.");
        System.out.println("4- Delete last games.");
        System.out.println("5- Exit.");
        System.out.print("Enter an option: ");
        try {
        int option = scanner.nextInt();
            switch (option) {
                case 1 ->  Random.Start();
                case 2 -> Personalized.Start();
                case 3 -> Utils.FileLoggingUtils.viewLog();
                case 4 -> Utils.FileLoggingUtils.deleteLog();
                case 5 -> System. exit(0);
                default -> opcionIncorrecta();

            }
        } catch (InputMismatchException e) {
            System.out.println("The input needs to be a number");
            Sleep.Main(3000);
            mainMenu();
        }
    }
    public static void opcionIncorrecta(){
        System.out.println("Not a valid option");
        Sleep.Main(3000);
        for (int i = 0; i < 100; i++) { // Clear screen
            System.out.println();
        }
        mainMenu(); // Recursividad menu
    }
}