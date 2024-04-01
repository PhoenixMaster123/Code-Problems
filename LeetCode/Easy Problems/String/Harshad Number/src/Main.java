public class Main {
    public static void main(String[] args) {

        int num = 18;
        System.out.println(sumOfTheDigitsOfHarshadNumber(num));
    }


    private static int sumOfTheDigitsOfHarshadNumber(int x)
    {
        String num = String.valueOf(x);
        char[] ch = num.toCharArray();
        int sum = 0;
        for(char c : ch)
        {
            sum += Integer.parseInt(String.valueOf(c));
        }

        if(x % sum == 0)
        {
            return sum;
        }
        return -1;
    }
}