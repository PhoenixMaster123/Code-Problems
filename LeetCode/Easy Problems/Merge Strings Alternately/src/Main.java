public class Main {
    public static void main(String[] args) {

        String word1 = "abcd";
        String word2 = "pq";

        System.out.println(mergeAlternately(word1,word2));
    }

    private static String mergeAlternately(String word1, String word2)
    {
        String result = "";

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        int length = 0;
        if(ch1.length > ch2.length)
        {
            length = ch1.length;
        }
        else
        {
            length = ch2.length;
        }

        for (int i = 0; i < length; i++)
        {
            if (i < ch1.length && i < ch2.length)
            {
                result += ch1[i];
                result += ch2[i];

            }
            else if (i < ch1.length)
            {
                result += ch1[i];
            }
            else if(i < ch2.length)
            {
                result += ch2[i];
            }
        }
        return result;
    }
}