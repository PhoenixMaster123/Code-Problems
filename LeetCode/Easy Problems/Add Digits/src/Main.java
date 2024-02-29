public class Main {
    public static void main(String[] args) {

        int number = 0;

        System.out.println(addDigits(number));
    }

    private static int addDigits(int number)
    {
        String result = String.valueOf(number);

        int sum = 0;
        while (number >= 10)
        {
            char[] ch = result.toCharArray();
            for (int i = 0; i < ch.length; i++)
            {
                sum += Integer.parseInt(String.valueOf(ch[i]));
            }
            number = sum;
            result = String.valueOf(number);
            sum = 0;
        }
        return number;
    }
}