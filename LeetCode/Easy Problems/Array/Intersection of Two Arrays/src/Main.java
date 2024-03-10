import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] result = intersection(nums1,nums2);

        for (int i : result)
        {
            System.out.print(i + " ");
        }
    }

    private static int[] intersection(int[] nums1, int[] nums2)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j])
                {
                    hashSet.add(nums2[j]);
                }
            }
        }
        int[] result = new int[hashSet.size()];
        int index = 0;
        for (int element : hashSet) {
            result[index++] = element;
        }
        return result;
    }
}