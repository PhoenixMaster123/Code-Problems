import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    private static void moveZeroes(int[] nums) {
        int counter = 0; // Pointer to track the position to place the next non-zero element

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { // If the current element is non-zero
                // Swap the current non-zero element with the element at counter position
                int temp = nums[i];
                nums[i] = nums[counter];
                nums[counter] = temp;

                // Move the counter to the next position
                counter++;
            }
        }
    }
}