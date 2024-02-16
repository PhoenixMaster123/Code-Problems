import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

       // int result = Factorial(n, 1);
        int result = Factorial(n);
        System.out.println(result);
    }

    private static int Factorial(int n) // int result)
    {
        ///////////////////////////////// Variant 1 ///////////////////////////
        /* 
        if (n == 1)
        {
            return result;
        }
        result *= n;
        return Factorial(n - 1, result);
        */
        ///////////////////////////////// Variant 2 ///////////////////////////
        if (n == 1)
        {
            return 1;
        }
        return n * Factorial (n - 1);
    }
}
