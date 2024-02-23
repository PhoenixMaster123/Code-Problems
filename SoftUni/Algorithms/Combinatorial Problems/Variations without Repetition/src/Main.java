import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        int k = Integer.parseInt(scanner.nextLine());

        String[] variations = new String[k];
        boolean[] used = new boolean[elements.length];

        variations(0,elements, variations, used);
    }

    private static void variations(int index, String[] elements, String[] variations, boolean[] used)
    {
        if(index == variations.length)
        {
            System.out.println(String.join(" ",variations));
        }
        else
        {
            for (int i = 0; i < elements.length; i++)
            {
                if(!used[i])
                {
                    used[i] = true;
                    variations[index] = elements[i];
                    variations(index + 1, elements,variations,used);
                    used[i] = false; // backtracking
                }
            }
        }
    }
}