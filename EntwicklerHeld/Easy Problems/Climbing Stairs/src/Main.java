public class Main {
    public static void main(String[] args) {

        int stairs = 5;

        int ways = climbingStairs(stairs);
        System.out.println(ways);
    }
        public static int climbingStairs(int numberOfStairs) {

            if (numberOfStairs <= 0)
            {
                return 0;
            }
            int ways = 1;

            for (int i = 1; i <= numberOfStairs / 2; i++)
            {
                double sum = 1;

                for(int j = i;j < 2 * i; j++)
                {
                    sum *= (double) (numberOfStairs - j) / (j - i + 1);
                }
                ways += sum;

            }
            return ways;
        }
}