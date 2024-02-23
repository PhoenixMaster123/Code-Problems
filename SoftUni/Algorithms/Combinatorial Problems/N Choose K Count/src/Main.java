import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        System.out.println(pascalTriangle(n,k));

    }

    private static int pascalTriangle(int n, int k)
    {
        if(k > n)
        {
            return 0;
        }
        if(k == 0 || k == n)
        {
            return 1;
        }
        return pascalTriangle(n - 1, k - 1) + pascalTriangle(n - 1, k);
    }
}