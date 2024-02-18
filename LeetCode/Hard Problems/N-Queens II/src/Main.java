import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int n = 4;
        System.out.println(totalNQueens(n));
    }
    public static int totalNQueens(int n) {

        int counter = 0;
            char[][] board = new char[n][n];

            for (int i = 0; i < board.length; i++) {
                Arrays.fill(board[i], '.');
            }

            counter = putQueens(board, 0, 0);
            return counter;

    }
        private static int putQueens(char[][] board, int row, int counter)
        {
            if(row == board.length)
            {
                return counter + 1;
            }
            for (int col = 0; col < board.length; col++)
            {
                if (checkThePosition(board,row,col))
                {
                    board[row][col] = 'Q';
                    counter = putQueens(board,row + 1, counter);
                    board[row][col] = '.';
                }
            }
            return counter;
        }
        private static boolean checkThePosition(char[][] board, int row, int col)
        {
            // Check Columns <=> Horizontal
            for(int c = 0; c < board.length; c++)
            {
                if(board[row][c] == 'Q')
                {
                    return false;
                }
            }

            // Check Rows <=> Vertical
            for(int r = 0; r < board.length; r++)
            {
                if(board[r][col] == 'Q')
                {
                    return false;
                }
            }

            int r = row;
            int c = col;

            // UpperLeft Diagonal
            while(r >= 0 && c >= 0)
            {
                if(board[r--][c--] == 'Q')
                {
                    return false;
                }
            }

            r = row;
            c = col;

            // Bottom Right Diagonal
            while(r < board.length && c < board.length)
            {
                if(board[r++][c++] == 'Q')
                {
                    return false;
                }
            }

            r = row;
            c = col;

            // Upper Right Diagonal
            while(r >= 0 && c < board.length)
            {
                if(board[r--][c++] == 'Q')
                {
                    return false;
                }
            }

            r = row;
            c = col;

            // Bottom Left Diagonal
            while(r < board.length && c >= 0)
            {
                if (board[r++][c--] == 'Q')
                {
                    return false;
                }
            }
            return true;
        }
    }