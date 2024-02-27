import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[k];

        combinations(0, 1,arr, n);
    }

    private static void combinations(int index, int start, int[] arr, int n)
    {
        if(index == arr.length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else
        {
            for (int i = start; i <= n; i++)
            {
                arr[index] = i;
                combinations(index + 1, i + 1,arr,n);
            }
        }
    }
}
