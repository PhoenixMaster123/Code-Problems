import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        int n = 4;
        int k = 2;

        System.out.println(combine(n,k));
    }
        public static List<List<Integer>> combine(int n, int k) // Dynamic Structure
        {
            List<List<Integer>> result = new ArrayList<>();
            combinations(n, k, result, 1, new ArrayList<>());
            return result;
        }
        private static void combinations(int n, int k, List<List<Integer>> result, int start, List<Integer> current)
        {
            if (k == 0)
            {
                result.add(new ArrayList<>(current)); // add the current combination
                return;
            }
            else
            {
                for(int i = start; i <= n; i++)
                {
                    current.add(i); // Add the current number to the current combination
                    combinations(n, k - 1, result, i + 1, current); // Recursive call with k - 1 and the next start index
                    current.remove(current.size() - 1); // Backtrack: Remove the last element to try the next one
                }
            }
        }
    }