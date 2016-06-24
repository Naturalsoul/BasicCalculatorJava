package BasicCalculatorJava;

import BasicCalculatorJava.Operations.sum;
import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/* This is a simple calculator. It's my first repository in Github with Java
 * code. I hope I'll continue coding and learning :)
 *
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
                    int checkNum;
                    ArrayList<Integer> nums = new ArrayList<>();
                    System.out.println("Type all the numbers u want to sum separated with spaces:");
                    reader.nextLine();

                    for (String token; (token = reader.findInLine("[1-9]")) != null;)
                        nums.add(Integer.valueOf(token));

                    sum Sum = new sum(nums);
                    System.out.println("\nTotal: " + Sum.doSum());

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
        System.out.println("9) Good bye!");
        System.out.println("\n");
        System.out.println("--------------------");


    }
}
