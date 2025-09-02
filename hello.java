import java.util.Scanner;

public class FactorialCalculator {

    // Iterative method to calculate factorial
    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        try {
            // Calculate factorial using the iterative method
            long iterativeResult = factorialIterative(number);
            System.out.println("Factorial (Iterative) of " + number + " is: " + iterativeResult);

            // Calculate factorial using the recursive method
            long recursiveResult = factorialRecursive(number);
            System.out.println("Factorial (Recursive) of " + number + " is: " + recursiveResult);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
