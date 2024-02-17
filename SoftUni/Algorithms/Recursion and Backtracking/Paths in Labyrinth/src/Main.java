import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Character> path = new ArrayList<>(); // global variable
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        char[][] labyrinth = new char[rows][cols];

        for (int row = 0; row < rows; row++)
        {
            labyrinth[row] = scanner.nextLine().toCharArray();
        }

        findPath(labyrinth, 0, 0, ' '); // start position
    }

    private static void findPath(char[][] labyrinth, int row, int col, char direction)
    {
        // out of bounds + base cases
        if (!isInBounds(labyrinth, row, col)
                || labyrinth[row][col] == 'V'
                || labyrinth[row][col] == '*')
        {
            return;
        }
        path.add(direction); // add direction

        // where we need to go
        if (labyrinth[row][col] == 'e')
        {
            printPath();
            path.remove(path.size() - 1);
            return;
        }
        labyrinth[row][col] = 'V'; // V = start position 0 0

        // Every direction -> top, bottom, left, right
        findPath(labyrinth, row, col - 1,'L'); // left
        findPath(labyrinth, row, col + 1,'R'); // right
        findPath(labyrinth, row - 1, col,'U'); // top
        findPath(labyrinth, row + 1, col,'D'); // bottom

        // Backtracking
        labyrinth[row][col] = '-';

        path.remove(path.size() - 1); // remove the last index
    }

    private static void printPath()
    {
        for (int i = 1; i < path.size(); i++) {
            System.out.print(path.get(i));
        }
        System.out.println();
    }

    private static boolean isInBounds(char[][] labyrinth, int row, int col)
    {
             // is in bounds
     return  row < labyrinth.length && row >= 0 &&
             col < labyrinth[row].length && col >= 0;
    }
}