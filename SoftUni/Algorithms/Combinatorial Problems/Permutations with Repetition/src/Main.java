import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        permute(0,elements);
    }
    private static void permute(int index, String[] elements)
    {
        if(index == elements.length)
        {
            System.out.println(String.join(" ", elements));
        }
        else
        {
            permute(index + 1, elements);
            HashSet<String> swapped = new HashSet<>();
            swapped.add(elements[index]);
            for (int i = index + 1; i < elements.length; i++)
            {
                if(!swapped.contains(elements[i])) {
                    swap(index, i, elements);
                    permute(index + 1, elements);
                    swap(index, i, elements);
                    swapped.add(elements[i]);
                }
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