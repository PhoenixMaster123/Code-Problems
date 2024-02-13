import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int n = 25;

        System.out.println(tribonacci(n));
    }
    private static Map<Integer, Integer> memo = new HashMap<>();
    public static int tribonacci(int n) {

        if (memo.containsKey(n))
            return memo.get(n);

        // Base cases
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        // Recursive calculation with memoization
        int sum = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        memo.put(n, sum);
        return sum;
    }
}