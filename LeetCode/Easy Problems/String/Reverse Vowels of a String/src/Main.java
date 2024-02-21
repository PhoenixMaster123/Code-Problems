public class Main {
    public static void main(String[] args) {

        String word = "leetcode";

        System.out.println(reverseVowels(word));
    }
        public static String reverseVowels(String s)
        {
            char[] ch = s.toCharArray();

            int i = 0;
            int j = ch.length - 1;

            while (i < j) {
                // Find the first vowel from the left
                while (i < j && !vowelCheker(ch[i])) {
                    i++;
                }
                // Find the first vowel from the right
                while (i < j && !vowelCheker(ch[j])) {
                    j--;
                }
                // Swap the vowels
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                // Move to the next pair of characters
                i++;
                j--;
            }

            return String.valueOf(ch);
        }
        private static boolean vowelCheker(char letter)
        {
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
               letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
            {
                return true;
            }
            return false;
        }
    }
}