public class Main {
    public static void main(String[] args) {

        int[][] board =
        {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
    }
        public static void gameOfLife(int[][] board)
        {
            int rows = board.length;
            int cols = board[0].length;

            int[][] gameboard = new int[rows] [cols];

            for (int i = 0; i < rows; i++)
            {
                for(int j = 0; j < cols; j++)
                {
                    int liveNeighbors = neighbor(board, i-1, j-1) + neighbor(board, i-1, j) + neighbor(board, i-1, j+1) + neighbor(board, i, j+1) +
                            neighbor(board, i+1, j+1) + neighbor(board, i+1, j) + neighbor(board, i+1, j-1) + neighbor(board, i, j-1);

                    if (board[i][j] == 1)
                    {
                        gameboard[i][j] = (liveNeighbors < 2 || liveNeighbors > 3) ? 0 : 1;
                    }
                    else
                    {
                        gameboard[i][j] = (liveNeighbors == 3) ? 1 : 0;
                    }
                }
            }
            for(int i = 0; i < rows; i++)
            {
                board[i] = gameboard[i].clone();
            }
        }
        public static int neighbor(int[][] board, int r, int c){
            if( r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 0 ){ return 0; }                          // out of bound cases
            return 1;
        }
    }