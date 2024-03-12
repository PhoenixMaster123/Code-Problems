public class Main {
    public static void main(String[] args) {

        String s = "day";

        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s)
    {
        String[] strings = s.split(" ");
        int length = 0;
        if(strings.length == 1)
        {
           length = strings[0].length();
        }
        for (int i = strings.length - 1; i > 0; i--)
        {
            length = strings[i].length();
            break;
        }
        return length;
    }
}