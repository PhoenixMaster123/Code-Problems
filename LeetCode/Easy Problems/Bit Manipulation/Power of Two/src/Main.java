public class Main {
    public static void main(String[] args) {

        int n = 1;

        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n)
    {
       // return (n > 0) && ((n & (n - 1)) == 0);

       ////////////////////////// Variant 2 ////////////////////////////
        {
            if (n <= 0) {
                return false;
            }
            if (n == 1) {
                return true;
            }
            if (n % 2 == 1) {
                return false;
            }
            return isPowerOfTwo(n / 2);

        }
    }

}