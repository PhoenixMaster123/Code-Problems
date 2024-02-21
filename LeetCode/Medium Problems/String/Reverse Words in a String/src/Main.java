public class Main {
    public static void main(String[] args) {

        String text = "a good   example";

        System.out.println(reverseWords(text));
    }

    private static String reverseWords(String text)
    {
        String[] strings = text.split(" ");
        String result = "";
        for (int i = strings.length - 1; i >= 0; i--)
        {
            if (strings[i].isEmpty() || strings[i].isBlank())
            {
                result += strings[i];
            }
            else
            {
                result += strings[i];
                result += " ";
            }
        }
        return result.trim();
    }
}