import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] result = sortPeople(names, heights);
        for (String name : result)
        {
            System.out.print(name + " ");
        }
    }

    private static String[] sortPeople(String[] names, int[] heights) {
        // Create an array of indices
        Integer[] indices = new Integer[names.length];
        for (int i = 0; i < names.length; i++) {
            indices[i] = i;
        }

        // Sort the indices array based on the heights array
        Arrays.sort(indices, Comparator.comparingInt(i -> heights[(int) i]).reversed());

        // Rearrange names according to sorted indices
        String[] sortedNames = new String[names.length];
        for (int i = 0; i < indices.length; i++) {
            sortedNames[i] = names[indices[i]];
        }

        return sortedNames;
    }
}