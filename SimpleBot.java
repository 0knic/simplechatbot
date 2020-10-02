package bot;

import java.util.Scanner;
import java.util.InputMismatchException;
public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Chat Bot", "2020");
        remindName();
        guessAge();
        count();
        test();

    }

    static void greet(String robotName, String birthYear) {
        System.out.println("Hello! My name is " + robotName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
        System.out.print("> ");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name.trim() + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        System.out.print("Remainder dividing by 3 > ");
        int rem3 = scanner.nextInt();
        System.out.print("Remainder dividing by 5 > ");
        int rem5 = scanner.nextInt();
        System.out.print("Remainder dividing by 7 > ");
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now... I will count to any number you want.");
        System.out.println("Type any integer and I will count to it!");
        System.out.print("> ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's see if you have any programming knowledge!");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        selectAnswer();
    }

    static void selectAnswer() {
        int input = 0;
        int errorMessageCheck = 0;
        System.out.println("Please type your answer as a number between 1 and 4:");
        while (input != 2) {
            try {
                if (errorMessageCheck >= 1) {
                    System.out.println("Wrong, please try again:");
                }
                System.out.print("> ");
                input = scanner.nextInt();
                if ((0 >= input) || (5 <= input)) {
                    System.out.println("Error: Please enter an integer between 1-4:");
                    errorMessageCheck = -1;
                }
                errorMessageCheck += 1;
            }
            catch (InputMismatchException e) {
                System.out.println("Error: Please enter an integer between 1-4:");
                errorMessageCheck = 0;
                scanner.next();
            }
        }
        scanner.close();
        end();
    }

    static void end() {
        System.out.println("You are correct, have a nice day!");
    }
}
