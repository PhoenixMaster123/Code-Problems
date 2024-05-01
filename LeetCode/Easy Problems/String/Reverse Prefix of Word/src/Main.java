public class Main {
    public static void main(String[] args) {
        String word = "xxxx";
        char ch = 'x';

        System.out.println(reversePrefix(word,ch));
    }

    private static String reversePrefix(String word, char ch)
    {
        int index = word.indexOf(ch);
        if (index == -1) { // Character not found
            return word;
        }
        StringBuilder builder = new StringBuilder(word.substring(0, index + 1));
        return builder.reverse().append(word.substring(index + 1)).toString();
    }
}