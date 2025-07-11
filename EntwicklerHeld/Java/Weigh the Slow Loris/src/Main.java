import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> masses = new ArrayList<>();
        masses.add(1);
        masses.add(2);
        masses.add(4);
        masses.add(8);
        masses.add(16);
        masses.add(32);
        masses.add(64);
        masses.add(128);

       int slowLorisWeight = 145;

       List<Integer> result = findMasses(masses, slowLorisWeight);
       Collections.sort(result);
       System.out.println(result);
    }

    private static List<Integer> findMasses(List<Integer> calibratedMasses, int slowLorisWeight)
    {
        Collections.sort(calibratedMasses, Collections.reverseOrder());
        List<Integer> result = new ArrayList<>();
        for (int mass : calibratedMasses)
        {
            if(slowLorisWeight >= mass)
            {
                result.add(mass);
                slowLorisWeight -= mass;
            }
        }
        return result;
    }
}