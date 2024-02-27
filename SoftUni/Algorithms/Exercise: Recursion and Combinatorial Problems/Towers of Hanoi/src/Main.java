import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static StringBuilder print = new StringBuilder();
    public static Deque<Integer> source = new ArrayDeque<>();
    public static Deque<Integer> spare = new ArrayDeque<>();
    public static Deque<Integer> destination = new ArrayDeque<>();

    public static int steps = 1;
    public static void main(String[] args) throws IOException {

       // Scanner scanner = new Scanner(System.in);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int disk = Integer.parseInt(reader.readLine());

        for (int i = disk; i > 0; i--)
        {
            source.push(i);
        }

        printRods();
        solveTower(disk,source, destination,spare);
        System.out.println(print.toString());
    }

    private static void solveTower(int disk, Deque<Integer> source, Deque<Integer> destination, Deque<Integer> spare)
    {
        if(disk == 1)
        {
            destination.push(source.pop());
            print.append("Step #").append(steps++).append(": Moved disk").append(System.lineSeparator());
            printRods();
        }
        else
        {
            solveTower(disk - 1, source,spare, destination);
            solveTower(1,source,destination,spare); // print -> force to go where disk = 1
            solveTower(disk - 1, spare, destination, source);
        }
    }

    private static void printRods()
    {
        print.append(String.format("Source: %s%nDestination: %s%nSpare: %s%n",
                formatRot(source),formatRot(destination), formatRot(spare))).append(System.lineSeparator());
    }

    private static String formatRot(Deque<Integer> stack)
    {
        return stack.stream().sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}