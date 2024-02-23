import java.util.Scanner;

///////////////////////// Rekursiv Solution - better(clean code) /////////////////////////
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        int k = Integer.parseInt(scanner.nextLine());

        String[] variations = new String[k];

        variations(0, elements, variations);
    }

    private static void variations(int index, String[] elements, String[] variations) {

        if (index == variations.length) {
            System.out.println(String.join(" ", variations));
        } else {
            for (int i = 0; i < elements.length; i++) {
                variations[index] = elements[i];
                variations(index + 1, elements, variations);
            }
        }

    }
}
/////////////////////////////////// Iterativ Solution /////////////////////////
/*
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        int k = Integer.parseInt(scanner.nextLine());

        generateVariations(elements, k);
    }

    private static void generateVariations(String[] elements, int k) {
        int[] indices = new int[k]; // Initialize indices array with all zeros
        int n = elements.length;

        while (true) {
            // Print current variation
            for (int i = 0; i < k; i++) {
                System.out.print(elements[indices[i]] + " ");
            }
            System.out.println();

            // Find the rightmost index that can be incremented
            int rightmost = k - 1;
            while (rightmost >= 0 && indices[rightmost] == n - 1) {
                rightmost--;
            }

            // If no such index is found, we have generated all variations
            if (rightmost == -1) {
                break;
            }

            // Increment the rightmost index and reset all indices to its right
            indices[rightmost]++;
            for (int i = rightmost + 1; i < k; i++) {
                indices[i] = 0;
            }
        }
    }
   }
 */
