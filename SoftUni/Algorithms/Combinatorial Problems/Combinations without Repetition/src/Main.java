import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        int k = Integer.parseInt(scanner.nextLine());

        String[] variations = new String[k];

        combinations(0,0, variations, elements);
    }

    private static void combinations(int index, int start, String[] variations, String[] elements)
    {
        if(index == variations.length)
        {
            System.out.println(String.join(" ",variations));
        }
        else
        {
            for (int i = start; i < elements.length; i++)
            {
                variations[index] = elements[i];
                combinations(index + 1, i + 1 , variations,elements);
            }
        }
    }
}