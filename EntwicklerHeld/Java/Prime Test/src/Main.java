public class Main {
    public static void main(String[] args) {

        int number = 6;
        System.out.println(testPrimeNumber(number));
    }
    public static boolean testPrimeNumber(int number)
    {

        if (number <= 1)
        {
            return false;
        }
        else
        {
            for (int i = 2; i < number; i++)
            {
                if(number % i == 0)
                {
                    return false;
                }
            }
            return true;
        }

    }
}