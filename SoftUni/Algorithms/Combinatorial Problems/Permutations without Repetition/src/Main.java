import java.util.Scanner;

public class Main {
    public static String[] elements;
    public static String[] permutes;
    public static boolean[] used;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        permutes = new String[elements.length];
        used = new boolean[elements.length];

        permutation(0, elements);
    }

    private static void permutation(int index, String[] elements)
    {
        if (index == elements.length)
        {
            print();
            return;
        }
        for (int i = 0; i < elements.length; i++)
        {
            if(!used[i]) {
                used[i] = true;
                permutes[index] = elements[i];
                permutation(index + 1, elements);
                used[i] = false;
            }
        }
    }
    public static void print()
    {
        System.out.println(String.join(" ", permutes));
    }
}