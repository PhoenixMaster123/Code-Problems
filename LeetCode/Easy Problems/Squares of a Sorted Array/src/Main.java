import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {-4,-1,0,3,10};

        int[] result = sortedSquares(nums);
        for (int num : result)
        {
            System.out.print(num + ",");
        }
    }

    private static int[] sortedSquares(int[] nums)
    {


        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = (int) Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }
}