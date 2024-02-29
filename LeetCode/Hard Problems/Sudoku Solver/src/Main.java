public class Main {
    public static void main(String[] args)
    {
        char[][] board = new char[][]
                {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}
                };

        solveSudoku(board);
        printBoard(board);
    }
        public static void solveSudoku(char[][] board)
        {
            solve(board,0,0);
        }
        private static boolean solve(char[][] board, int row, int col)
        {
            // Base case: If row is equal to board length, the entire board has been filled
            if(row == board.length)
            {
                return true;
            }

            // Move to the next row, when the current row is done
            if(col == board[0].length)
            {
                return solve(board,row + 1, 0);
            }
            // Skip cells that are already filled
            if(board[row][col] != '.')
            {
                return solve(board,row,col + 1);
            }
            // Try different numers in current cell
            for(char num = '1'; num <= '9'; num++)
            {
                if(isValidPosition(board, row,col,num))
                {
                    board[row][col] = num; // Filled with valid number

                    //Move next cell
                    if(solve(board,row,col + 1))
                    {
                        return true;
                    }
                    //Backtracking if no solution is found
                    board[row][col] = '.';
                }
            }
            // No valid soluton
            return false;

        }

        private static boolean isValidPosition(char[][] board, int row, int col, char num)
        {
            for(int i = 0; i < board.length;i++)
            {
                // Check row
                if(board[i][col] == num)
                {
                    return false;
                }
                //Check col
                if(board[row][i] == num)
                {
                    return false;
                }

                int subgridRow = 3 * (row / 3) + i / 3; // row index of subgrid (box - 9 boxes)
                int subgridCol = 3 * (col / 3) + i % 3; // col index of subgrid

                if(board[subgridRow][subgridCol] == num)
                {
                    return false;
                }
            }
            return true;
        }
    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            // Print horizontal separator for every third row
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------");
            }
            for (int j = 0; j < board[0].length; j++) {
                // Print vertical separator for every third column
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}