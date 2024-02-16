import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                   .mapToInt(Integer::parseInt).toArray();

        // Example 1 2 3 4

        int sum = sumRekursion(arr, 0, 0);

        System.out.println(sum);
    }

    private static int sumRekursion(int[] numbers, int index) //int sum)
    {

        /* if (index >= numbers.length)
        {
            return 0;
        }
        return numbers[index] + sumRekursion(numbers, index + 1);
         */

        ///////////////////////////////// Variant 2 //////////////////////////
        /*
        if (index == numbers.length)

        {
            return sum;
        }
        sum += numbers[index];
        return sumRekursion(numbers,index + 1, sum);
         */
        ///////////////////////////////// Variant 3 //////////////////////////

        if(index == numbers.length - 1)
        {
            return numbers[index];
        }
        return numbers[index] + sumRekursion(numbers, index + 1);
    }
}