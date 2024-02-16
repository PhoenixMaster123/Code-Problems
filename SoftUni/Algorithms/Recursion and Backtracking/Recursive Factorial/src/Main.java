import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int result = Factorial(n, 1);

        System.out.println(result);
    }

    private static int Factorial(int n, int result)
    {
        if (n == 1)
        {
            return result;
        }
        result *= n;
        return Factorial(n - 1, result);
    }
}