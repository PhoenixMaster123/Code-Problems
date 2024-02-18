import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
       int n = 4;
       System.out.println(solveNQueens(n));
    }
        public static List<List<String>> solveNQueens(int n)
        {
            char[][] board = new char[n][n];

            for(int i = 0; i < board.length; i++)
            {
                /*
                for(int j = 0; j < board[i].length; j++)
                {
                    board[i][j] = '.';
                }

                 */
                Arrays.fill(board[i], '.');
            }
            List<List<String>> result = new ArrayList<>();
            putQueens(board, 0 , result);
            return result;
        }
        private static void putQueens(char[][] board, int row, List<List<String>> list)
        {
            if(row == board.length)
            {
                list.add(buildBoard(board));
                return;
            }
            for (int col = 0; col < board.length; col++)
            {
                if (checkThePosition(board,row,col))
                {
                    board[row][col] = 'Q';
                    putQueens(board,row + 1, list);
                    board[row][col] = '.';
                }
            }
        }
        private static List<String> buildBoard(char[][] board)
        {
            List<String> internal = new ArrayList<>();
            for(int i = 0; i < board.length; i++)
            {
                String row = new String(board[i]);
                internal.add(row);
            }
            return internal;
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