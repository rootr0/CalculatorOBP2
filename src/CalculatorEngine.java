import java.util.InputMismatchException;
import java.util.Scanner;

class CalculatorEngine {
    private int operation;

    public void runCalculator() {

        while (true) {
            UserInterface.showMenu();
            operation = UserInterface.getUserChoice();

            if (operation == 5) {
                UserInterface.exit();
            }

            try {
                System.out.println("\nPlease enter two whole numbers!");
                System.out.print("First number: ");
                int a = new Scanner(System.in).nextInt();

                System.out.print("Second number: ");
                int b = new Scanner(System.in).nextInt();

                switch (operation) {
                    case 1:
                        new AdditionOperation().execute(a, b);
                        break;
                    case 2:
                        new SubtractionOperation().execute(a, b);
                        break;
                    case 3:
                        new MultiplicationOperation().execute(a, b);
                        break;
                    case 4:
                        new DivisionOperation().execute(a, b);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }

                UserInterface.options();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid whole numbers.");
            }
        }
    }
}
