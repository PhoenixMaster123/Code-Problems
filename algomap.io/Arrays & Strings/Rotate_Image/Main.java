package Rotate_Image;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[][] matrix =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        rotate(matrix);
    }
    public static void rotate(int[][] matrix)
    {
        int rows = matrix.length;
        int cols = rows;
        int[][] matrix2 = new int[cols][rows];

        for(int col = 0; col < cols; col++)
        {
            int counter = 0;
            for(int row = rows - 1; row >= 0; row--)
            {
                matrix2[col][counter++] = matrix[row][col];
            }
        }

        for(int row = 0; row < matrix2.length; row++)
        {
            for(int col = 0; col <matrix2[row].length; col++)
            {
                matrix[row][col] = matrix2[row][col];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
