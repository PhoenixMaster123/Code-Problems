public class Main {
    public static void main(String[] args) {

        int left = 5;
        int right = 7;
        System.out.println(rangeBitwiseAnd(left,right));
    }

    private static int rangeBitwiseAnd(int left, int right)
    {
        int result = right;

        while (right > left)
        {
            result = right & (right - 1);
            right = result;
        }
        return result;
    }
    /*
    //////////////////////////// Explanation ////////////////////////////////

Given Range: You are given two integers, left and right, which represent the inclusive range [left, right]. This means that you're interested in all the integers between left and right, including both left and right themselves.

Bitwise AND Operation: The problem asks you to perform a bitwise AND operation on all the numbers in the given range. Bitwise AND is an operation that is performed on corresponding bits of two numbers. If both bits are 1, the resulting bit is 1; otherwise, it's 0.

Return Value: Finally, you need to return the result of performing the bitwise AND operation on all the numbers in the given range [left, right].

Let's consider an example:

Suppose left = 5 and right = 7. In binary representation, these numbers are:

5 is 101.
6 is 110.
7 is 111.
Performing the bitwise AND operation on these numbers:

sql
Copy code
    101
AND 110
AND 111
  -----
    100   (This is the result)
So, the bitwise AND of all numbers in the range [5, 7] is 100, which is 4 in decimal representation.
     */
}