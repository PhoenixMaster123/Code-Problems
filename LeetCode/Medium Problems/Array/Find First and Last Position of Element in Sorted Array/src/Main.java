public class Main {
    public static void main(String[] args) {

        int[] nums = {1};
        int target = 1;

        int[] result = searchRange(nums,target);
        for (int num : result)
        {
            System.out.print(num + " ");
        }
    }

    private static int[] searchRange(int[] nums, int target)
    {
        int first = -1, last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }
}