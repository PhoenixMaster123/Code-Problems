public class Main {
    public static void main(String[] args) {

        double x = 2.00000;
        int n = -2147483648;

        System.out.println(myPow(x, n));
    }
    public static double myPow(double x, int n)
    {
        long N = n; // Convert n to long to handle the maximum negative value

        if (N == 0) {
            return 1;
        }
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        while (N > 0) {
            if (N % 2 == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }
        return result;
    }// return Math.pow(x,n);
}