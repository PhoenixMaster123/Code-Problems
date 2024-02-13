using System;
using System.Collections.Generic;
internal class Program
{
    private static void Main(string[] args)
    {
        int[] numbers = { 2, 5, 1, 3, 4, 7 };
        int n = 3;

       int[] result = shuffle(numbers, n);

        foreach (int i in result) 
        {
            Console.Write(i + " ");
        }
    }

    private static int[] shuffle(int[] nums, int n)
    {
        int[] retArray = new int[2 * n];
        int j = 0;

        for (int i = 0; i < n; i++)
        {
            retArray[j] = nums[i];
            j++;
            retArray[j] = nums[i + n];
            j++;
        }
        return retArray;
    }
}