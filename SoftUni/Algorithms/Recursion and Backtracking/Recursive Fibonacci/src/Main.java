import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

       // System.out.println(Fibonacci(n));

        System.out.println(Fibonacci(n));
    }
    // Iterativ
    private static long Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Initialize variables for Fibonacci sequence
        long prev = 0;
        long curr = 1;
        long next;

        // Calculate Fibonacci numbers iteratively
        for (int i = 2; i <= n; i++) {
            next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    // Rekursiv
    /* private static long Fibonacci(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
     */
}