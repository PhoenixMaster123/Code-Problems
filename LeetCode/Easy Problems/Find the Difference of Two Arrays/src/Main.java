import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

        List<List<Integer>> result = findDifference(nums1,nums2);

        System.out.println(result);
    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2)
    {
        /*////////////////////////// Variant 2 - better //////////////////////////////
         HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> lst1 = new ArrayList<>(set1) ;
        List<Integer> lst2 = new ArrayList<>(set2) ;
        lst1.removeAll(set2);
        lst2.removeAll(set1);
        result.add(lst1);
        result.add(lst2);
        return result;
         */
        ////////////////////////// Variant 1 //////////////////////////////
        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> list1 = new HashSet<>();
        HashSet<Integer> list2 = new HashSet<>();

        boolean isFound = false;
        for (int i = 0; i < nums1.length; i++)
        {
            for (int j = 0; j < nums2.length; j++)
            {
                if (nums1[i] == nums2[j])
                {
                    isFound = true;
                    break;
                }
                isFound = false;
            }
            if(!isFound)
            {
                list1.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++)
        {
            for (int j = 0; j < nums1.length; j++)
            {
                if (nums2[i] == nums1[j])
                {
                    isFound = true;
                    break;
                }
                isFound = false;
            }
            if(!isFound)
            {
                list2.add(nums2[i]);
            }
        }
        result.add(new ArrayList<>(list1));
        result.add(new ArrayList<>(list2));

        return result;
    }
}