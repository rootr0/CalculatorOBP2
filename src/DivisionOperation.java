class DivisionOperation implements Operation {
    public void execute(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
        } else {
            System.out.println("\nResult (Division): " + (a / b));
        }
    }
}
