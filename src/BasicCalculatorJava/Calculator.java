package BasicCalculatorJava;

import java.util.InputMismatchException;
import java.util.Scanner;

/* This is a simple calculator. It's my first repository in Github with Java
 * code. I hope I'll continue coding and learning :)
 *
 */
public class Calculator {
    public static void main(String[] args) {
        int selection;

        while(true) {
            Scanner reader = new Scanner(System.in);
            menu();

            try {
                System.out.print("Choose an option: ");
                selection = reader.nextInt();
                System.exit(0);
            } catch (InputMismatchException ex) {
                System.out.println("\nOnly numbers, pls!\n");
            }
        }
    }

    private static void menu() {
        System.out.println("--------------------");
        System.out.println("Hey!! what u want to do? :D");
        System.out.println("1) I want a sum!");
        System.out.println("\n");
        System.out.println("--------------------");


    }
}
