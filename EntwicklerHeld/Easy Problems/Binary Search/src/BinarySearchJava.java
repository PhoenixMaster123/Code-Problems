import java.util.Arrays;

public class BinarySearchJava {
    public static Result find(int[] array, int element)
    {
        int steps = 0;
        int index = -1;

        int highPoint = array.length - 1;
        int lowPoint = 0;

        if (array.length == 1)
        {
            index = 0;
            return new Result(steps, index);
        }
        else
        {
            while (lowPoint <= highPoint)
            {
                int mid = lowPoint + (highPoint - lowPoint) / 2;

                if(array[mid] == element)
                {
                    index = mid;
                    break;
                }
                else if(array[mid] < element)
                {
                    lowPoint = mid + 1;

                }
                else
                {
                    highPoint = mid - 1;
                }
                steps++;
            }
        }
        return new Result(steps, index);
    }
}