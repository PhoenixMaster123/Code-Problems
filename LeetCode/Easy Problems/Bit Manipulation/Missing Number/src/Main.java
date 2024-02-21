import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums)
    {
        /*
        int n = nums.length;
        int totalSum = Arrays.stream(nums).sum();
        return n*(n+1)/2 - totalSum;
         */
        ///////////////////////////// Variant 1 /////////////////////////////
        Arrays.sort(nums);
        int missingNumber = 0;
        int range = nums.length;
        boolean check = false;
        for (int i = 0; i < nums.length; i++)
        {
            if(i != nums[i])
            {
                missingNumber = i;
                check = true;
                break;
            }
        }
        if(!check)
        {
            return range;
        }
        return missingNumber;
    }
}