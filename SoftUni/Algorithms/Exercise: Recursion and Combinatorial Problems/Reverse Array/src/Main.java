import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /////////////////////// Variant 1 //////////////////
        Scanner scanner = new Scanner(System.in);
        /////////////////////// Variant 2 ////////////////// -> faster
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = scanner.nextLine().split(" ");

        reverseArray(nums.length - 1,nums);
    }

    private static void reverseArray(int index,String[] nums)
    {
        if(index < 0)
        {
            return;
        }
        System.out.print(nums[index] + " ");
        reverseArray(index - 1, nums);
    }
}