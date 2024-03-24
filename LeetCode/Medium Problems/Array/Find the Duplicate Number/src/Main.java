import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,2,4};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums)
    {
        ///////////////////////////// speed /////////////////////////////////
        int tortoise = nums[0];
        int hare = nums[0];

        // Phase 1: Findet den Treffpunkt
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Phase 2: Findet den Startpunkt des Zyklus
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
        /*
        ///////////////////////////// fast /////////////////////////////////
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            }
            map.put(num, 1);
        }
        return -1;

         */
        /*
        ///////////////////////////// slow /////////////////////////////////
        Arrays.sort(nums); // Sortiere das Array

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }

        return -1;
         */
        ///////////////////////////// Very slow /////////////////////////////////
        /*List<Integer> num = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if(!num.contains(nums[i]))
            {
                num.add(nums[i]);
            }
            else
            {
                result = nums[i];
                break;
            }
        }
        return result;

         */
    }
}