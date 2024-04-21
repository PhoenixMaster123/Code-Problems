public class Main {
    public static void main(String[] args) {

        int n = 2;

        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n)
    {
        if(n == 1)
        {
            return true;
        }
        int result = 0;
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        while(true)
        {


            for(char c : ch)
            {
                result += (int) Math.pow(Integer.parseInt(String.valueOf(c)), 2);
            }
            if (result == 1 || result == 7)
            {
                return true;
            }
            else if(result < 10)
            {
                break;
            }
            str = String.valueOf(result);
            ch = str.toCharArray();
            result = 0;
        }
        return false;
    }
}