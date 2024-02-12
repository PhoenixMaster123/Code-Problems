import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        int rowIndex = 2;
        System.out.println(getRow(rowIndex));
    }
    public static List<Integer> getRow(int rowIndex)
    {   List<List<Integer>> result = new ArrayList<>();

        if (rowIndex == 0) {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            return firstRow;
        }

        if (rowIndex == 1) {
            List<Integer> secondRow = new ArrayList<>();
            secondRow.add(1);
            secondRow.add(1);
            return secondRow;
        }

        // Initialize the first two rows
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        result.add(secondRow);

        // Generate subsequent rows
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> prevList = result.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < prevList.size(); j++) {
                row.add(prevList.get(j) + prevList.get(j - 1));
            }

            row.add(1);
            result.add(row);
        }

        // Return the row at the given index
        return result.get(rowIndex);
    }
}