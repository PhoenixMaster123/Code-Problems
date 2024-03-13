public class Main {
    public static void main(String[] args)
    {
        int n = 4;
        System.out.println(pivotInteger(n));
    }
     public static int pivotInteger(int n) {
            int sum = n * (n + 1) / 2;
            double sqrt = Math.sqrt(sum);

            if (sqrt - Math.ceil(sqrt) == 0) {
                return (int) Math.sqrt((double) (n * (n + 1)) / 2);
            } else {
                return -1;
            }
        }
     }