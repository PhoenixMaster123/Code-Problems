import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        DrawRecursiv(n);
    }

    private static void DrawRecursiv(int n)
    {
        if (n == 0)
        {
            return;
        }
            for (int i = 0; i < n; i++)
            {
                System.out.print("*");
            }
            System.out.println();

            DrawRecursiv(n - 1);

        for (int i = n; i > 0; i--)
        {
            System.out.print("#");
        }
        System.out.println();
    }
}