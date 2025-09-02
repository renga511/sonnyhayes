public class FactorialCalculator {
    public static void main(String[] args) {
        int n = 5; // default
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
