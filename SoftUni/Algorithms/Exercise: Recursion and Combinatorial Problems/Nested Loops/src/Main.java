import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static int n;
    public static int[] nums;
    public static void main(String[] args) throws IOException {

       // Scanner scanner = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bufferedReader.readLine());

        nums = new int[n];

        nestedLoops(0);
    }

    private static void nestedLoops(int index)
    {
        if(index == nums.length)
        {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        else
        {
            for (int i = 1; i <= n ; i++)
            {
                nums[index] = i;
                nestedLoops(index + 1);
            }
        }
    }
}