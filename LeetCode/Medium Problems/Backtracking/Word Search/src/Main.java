import java.util.*;

public class Main {
    public static void main(String[] args) {

        char[][] board =
        {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCED";

        System.out.println(exist(board,word));
    }

    private static boolean exist(char[][] board, String word)
    {
        char[] charArray = word.toCharArray();
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (search(board, i, j, charArray, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean search(char[][] board, int row, int col, char[] word, int index) {
        if (index == word.length) {
            return true; // Base case: all characters in the word are found
        }

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word[index]) {
            return false; // Out of bounds or character mismatch
        }

        char temp = board[row][col];
        board[row][col] = '*'; // Mark the current cell as visited

        // Explore adjacent cells
        boolean found =
                search(board, row + 1, col, word, index + 1) ||
                search(board, row - 1, col, word, index + 1) ||
                search(board, row, col + 1, word, index + 1) ||
                search(board, row, col - 1, word, index + 1);

        // backtracking
        board[row][col] = temp; // Restore the original character
        return found;
    }
}