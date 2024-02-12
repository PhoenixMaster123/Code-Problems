import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0)
        {
            return result;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if (numRows == 1)
        {
            return result;
        }
        for(int i = 1; i < numRows; i++)
        {
            List<Integer> prevList = result.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j = 1; j < prevList.size(); j++)
            {
                row.add(prevList.get(j) + prevList.get(j - 1));
            }
            row.add(1);
            result.add(row);

        }
        return result;
    }
}