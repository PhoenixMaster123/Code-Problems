import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String str1 = "CHECKITWHEREISTHELONGESTSUBSTRING24";

        String str2 = "SUBSTINGWHERECHECKITANTCHECK24ISCHECKWHERE";

        System.out.println(findLongestSubstring(str1, str2));
    }
        public static String findLongestSubstring(String string1, String string2) {

            List<String> result = new ArrayList<>();

            if (string1 == null || string2 == null || string1.isEmpty() || string2.isEmpty())
            {
                return "";
            }

            int maxLength = 0;

            for (int i = 0; i < string1.length(); i++) {

                for (int j = 0; j < string2.length(); j++) {

                    int k = 0;
                    while (i + k < string1.length()
                            && j + k < string2.length()
                            && string1.charAt(i + k) == string2.charAt(j + k))
                    {
                        k++;
                    }

                    if (k > maxLength)
                    {
                        maxLength = k;
                        result.clear();
                        result.add(string1.substring(i,i+k));
                    }
                    else if (k == maxLength)
                    {
                        result.add(string1.substring(i,i + k));
                    }
                }
            }
            if (maxLength == 0)
            {
                return "";
            }
            return String.join(" ", result);
        }
    }