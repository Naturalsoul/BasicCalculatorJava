package BasicCalculatorJava;

import BasicCalculatorJava.Operations.multiplication;
import BasicCalculatorJava.Operations.sum;
import BasicCalculatorJava.Operations.subtraction;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This is a simple calculator. It's my first repository in Github with Java
 * code. I hope I'll continue coding and learning :)
 */

public class Calculator {
    public static void main(String[] args) {
        int selection = 0;

        while(true) {
            Scanner reader = new Scanner(System.in);
            menu();

            try {
                System.out.print("Choose an option: ");
                selection = reader.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("\nOnly numbers, pls!\n");
            }

            switch (selection) {
                case 1:
                    System.out.println("Type all the numbers u want to sum separated with spaces:");
                    sum Sum = new sum(getNums(reader));

                    System.out.println("\nTotal: " + Sum.doSum());
                    break;

                case 2:
                    System.out.println("Type all the numbers u want to subtract separated with spaces:");
                    subtraction Sub = new subtraction(getNums(reader));

                    System.out.println("\nTotal: " + Sub.doSubtraction());
                    break;

                case 3:
                    System.out.println("Type all the numbers u want to multiply separated with spaces:");
                    multiplication Mult = new multiplication(getNums(reader));

                    System.out.println("\nTotal: " + Mult.doMultiplication());
                    break;

                case 9:
                    System.out.println("See ya later!! ;D");
                    System.exit(0);
            }
        }
    }

    private static void menu() {
        System.out.println("--------------------");
        System.out.println("Hey!! what u want to do? :D");
        System.out.println("1) I want a sum!");
        System.out.println("2) Subtraction, pls.");
        System.out.println("3) Can I have a multiplication, pls?");
        System.out.println("9) Good bye!");
        System.out.println("--------------------");
    }

    private static ArrayList<Integer> getNums(Scanner reader) {
        ArrayList<Integer> nums = new ArrayList<>();

        reader.nextLine(); // This is necessary to read the input correctly.

         /*
          * The for loop make a variable called 'token' every loop and save
          * something in It that match with the pattern of the 'findInLine' function.
          * The 'Integer.valueOf()' function return the int value of the string.
          */

        for (String token; (token = reader.findInLine("[0-9]+")) != null;)
            nums.add(Integer.valueOf(token));

        return nums;
    }
}
