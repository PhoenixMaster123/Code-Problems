import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            // Test cases
            int[] arr1 = {6};
            int[] arr2 = {1, 3, 4, 6, 8, 9, 11};
            int[] emptyArr = {};

            System.out.println(BinarySearchJava.find(arr1, 6)); // Expected: (step: 0, index: 0)
            System.out.println(BinarySearchJava.find(arr2, 3)); // Expected: (step: 1, index: 1)
            System.out.println(BinarySearchJava.find(emptyArr, 6)); // Expected: (step: 0, index: -1)
        }
    }
