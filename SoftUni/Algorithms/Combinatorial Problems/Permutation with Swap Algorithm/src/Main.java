import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        permute(0,elements);

    }
    public static void permute(int index, String[] elements)
    {
        if (index == elements.length)
        {
            System.out.println(String.join(" ", elements));
            return;
        }
        else
        {
            permute(index + 1, elements);
            for (int i = index + 1; i < elements.length; i++)
            {
                swap(index, i, elements); // swap
                permute(index + 1, elements);
                swap(index, i, elements); // backtracking
            }
        }
    }

    private static void swap(int first, int second, String[] elements)
    {
        String temp = elements[first];
        elements[first] = elements[second];
        elements[second] = temp;
    }
}