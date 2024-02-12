import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        int rowNumber = 3;
        System.out.println(getPascalsTriangleRow(rowNumber));
    }
        public static List<Long> getPascalsTriangleRow(int rowNumber) {

            List<List<Long>> result = new ArrayList<>();

            // Base case: rowNumber = 0
            if (rowNumber == 0) {
                List<Long> firstRow = new ArrayList<>();
                firstRow.add(1L);
                return firstRow;
            }

            // Base case: rowNumber = 1
            if (rowNumber == 1) {
                List<Long> secondRow = new ArrayList<>();
                secondRow.add(1L);
                secondRow.add(1L);
                return secondRow;
            }

            // Initialize the first two rows
            List<Long> firstRow = new ArrayList<>();
            firstRow.add(1L);
            result.add(firstRow);

            List<Long> secondRow = new ArrayList<>();
            secondRow.add(1L);
            secondRow.add(1L);
            result.add(secondRow);

            // Generate subsequent rows
            for (int i = 2; i <= rowNumber; i++) {
                List<Long> prevRow = result.get(i - 1);
                List<Long> currentRow = new ArrayList<>();
                currentRow.add(1L);

                for (int j = 1; j < prevRow.size(); j++) {
                    long sum = prevRow.get(j) + prevRow.get(j - 1);
                    currentRow.add(sum);
                }

                currentRow.add(1L);
                result.add(currentRow);
            }

            return result.get(rowNumber);
        }
    }