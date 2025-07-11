import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> allMasses = new ArrayList<>();
        allMasses.add(1);
        allMasses.add(3);
        allMasses.add(9);
        allMasses.add(27);
        allMasses.add(81);
        allMasses.add(243);

        int slowLorisWeighs = 291;
        List<List<Integer>> result = findAllRightMasses(allMasses, slowLorisWeighs);
        System.out.println(result);
    }

    private static List<List<Integer>> findAllRightMasses(List<Integer> allMasses, int weights)
    {
        Collections.sort(allMasses, Collections.reverseOrder());

        List<Integer> rightSite = new ArrayList<>();
        List<Integer> leftSite = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < allMasses.size(); i++)
        {
            if (weights >= allMasses.get(i))
            {
                rightSite.add(allMasses.get(i));
                weights -= allMasses.get(i);
            }
            else if (weights < allMasses.get(i))
            {
                leftSite.add(allMasses.get(i + 1));
                weights += allMasses.get(i);
                i--;

            }
        }

        for (int removeDuplicate : leftSite) {
            if (rightSite.contains(removeDuplicate)) {
                rightSite.remove(Integer.valueOf(removeDuplicate));
            }
        }

        Collections.sort(rightSite);
        Collections.sort(leftSite);
        result.add(leftSite);
        result.add(rightSite);
        return result;
    }
}