public class Main {
    public static char[][] chessBoard =
            {
                    {'-','-','-','-','-','-','-','-'},
                    {'-','-','-','-','-','-','-','-'},
                    {'-','-','-','-','-','-','-','-'},
                    {'-','-','-','-','-','-','-','-'},
                    {'-','-','-','-','-','-','-','-'},
                    {'-','-','-','-','-','-','-','-'},
                    {'-','-','-','-','-','-','-','-'},
                    {'-','-','-','-','-','-','-','-'}
            };

    public static void main(String[] args) {
        findQueenPosition(0);
    }
    public static void findQueenPosition(int row)
    {
        if (row == 8)
        {
            printSolution();
        }
        else
        {
            for (int col = 0; col < 8; col++)
            {
                if (canPlaceQueen(row,col))
                {
                    putQueen(row,col);
                    findQueenPosition(row + 1);
                    removeQueen(row,col);
                }
            }
        }
    }

    private static void removeQueen(int row, int col)
    {
        chessBoard[row][col] = '-';
    }
    private static void putQueen(int row, int col)
    {
        chessBoard[row][col] = '*';
    }
    public static boolean canPlaceQueen(int row, int col)
    {
        // Mark column
        for (int c = 0; c < 8; c++)
        {
            if (chessBoard[row][c] == '*')
            {
                return false;
            }

        }
        // Mark row
        for (int r = 0; r < 8; r++)
        {
            if (chessBoard[r][col] == '*')
            {
                return false;
            }
        }
        // Mark both diagonals

        int r = row;
        int c = col;

        // up left diagonal
        while (r >= 0 && c >= 0)
        {
            if (chessBoard[r--][c--] == '*')
            {
                return false;
            }
        }
        r = row;
        c = col;

        // opposite diagonal
        while (r < 8 && c < 8)
        {
            if (chessBoard[r++][c++] == '*')
            {
                return false;
            }
        }
        r = row;
        c = col;

        // up right diagonal
        while (r >= 0 && c < 8)
        {
            if (chessBoard[r--][c++] == '*')
            {
                return false;
            }
        }
        r = row;
        c = col;

        // opposite diagonal
        while (r < 8 && c >= 0)
        {
            if (chessBoard[r++][c--] == '*')
            {
                return false;
            }
        }
        return true;
    }
    public static void printSolution()
    {
        for (char[] chars : chessBoard) {
            for (char symbols : chars) {
                System.out.print(symbols + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}