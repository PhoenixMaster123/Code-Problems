public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{-4,-2,1,4,8};

        System.out.println(findClosestNumber(nums));
    }

    private static int findClosestNumber(int[] nums)
    {
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(result)) {
                result = nums[i]; // Assign the actual value, not its absolute value
            } else if (Math.abs(nums[i]) == Math.abs(result) && nums[i] > result) {
                // If the absolute values are the same, choose the positive one
                result = nums[i];
            }
        }
        return result;
    }
}