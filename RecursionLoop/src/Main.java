public class Main {

    // Recursive method to calculate factorial
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // Iterative method using a while loop
    public static long factorialIterative(int n) {
        long result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 20;

        // Measure time for recursive method
        long startRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(n);
        long endRecursive = System.nanoTime();
        long timeRecursive = endRecursive - startRecursive;


        // Measure time for iterative method
        long startIterative = System.nanoTime();
        long resultIterative = factorialIterative(n);
        long endIterative = System.nanoTime();
        long timeIterative = endIterative - startIterative;

        // Print results
        System.out.println("Factorial of " + n + " (Recursive): " + resultRecursive);
        System.out.println("Time taken (Recursive): " + timeRecursive + " ns");

        System.out.println("Factorial of " + n + " (Iterative): " + resultIterative);
        System.out.println("Time taken (Iterative): " + timeIterative + " ns");
    }
}
