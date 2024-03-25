import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2 , 2 , 3, 4 ,3};

        List<Integer> result = findDuplicates(nums);

        for (int num : result)
        {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> findDuplicates(int[] nums)
    {
        List<Integer> duplicate = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                duplicate.add(num);
            }
        }

        return duplicate;
    }
}