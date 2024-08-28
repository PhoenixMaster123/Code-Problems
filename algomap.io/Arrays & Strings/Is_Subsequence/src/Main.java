import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "ab";
        String t = "baab";

        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t)
    {
        if (s.isEmpty())
        {
            return true;
        }
        if(s.length() > t.length())
        {
            return false;
        }
        int j = 0;
        for (int i = 0; i < t.length(); i++)
        {
            if(t.charAt(i) == s.charAt(j))
            {
                if(j == s.length() - 1)
                {
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}