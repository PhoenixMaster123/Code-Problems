import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs)
    {
        int size = strs.length;
        if(size == 0)
        {
            return "";
        }
        if(size == 1)
        {
            return strs[0];
        }

        Arrays.sort(strs);

        int end = Math.min(strs[0].length(), strs[size - 1].length());

        int index = 0;

        while(index < end && strs[0].charAt(index) == strs[size - 1].charAt(index))
        {
            index++;
        }
        String prefix = strs[0].substring(0,index);
        return prefix;
    }
}