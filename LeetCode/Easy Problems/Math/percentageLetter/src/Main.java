public class Main {
    public static void main(String[] args) {

        String s = "foobar";
        char letter = 'o';
        System.out.println(percentageLetter(s,letter));
    }

    private static int percentageLetter(String s, char letter)
    {
        char[] ch = s.toCharArray();
        int counter = 0;
        for (char c : ch)
        {
            if(c == letter)
            {
                counter++;
            }
        }
        double result = ((double) counter / ch.length) * 100;
        return (int) result;
    }
}