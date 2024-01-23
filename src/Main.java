import java.util.InputMismatchException;
import java.util.Scanner;

class UserInterface {
    public static void showMenu() {
        System.out.println("\nSimple Calculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public static int getUserChoice() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Your choice: ");
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= 5) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
        return choice;
    }

    public static void options() {
        System.out.print("\nWould you like to try again?");
        System.out.print("\n1 - Yes\n2 - No");

        System.out.print("\nEnter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();

        if (c == 1) {
        } else if (c == 2) {
            exit();
        } else {
            System.out.println("This is not a valid number. Exiting the program.");
            exit();
        }
    }

    public static void exit() {
        System.out.println("Exiting the program. Goodbye!");
        System.exit(0);
    }
}

