import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Integer[] memory = new Integer[n];
        
        fillVector(memory, 0);
    }

    private static void fillVector(Integer[] memory, int index)
    {
        if(index >= memory.length)
        {
            printMemory(memory);
            return;
        }

        for (int i = 0; i <= 1; i++)
        {
            memory[index] = i;
            fillVector(memory,index + 1);
        }
    }

    private static void printMemory(Integer[] memory)
    {
        for (Integer integer : memory)
        {
            System.out.print(integer);
        }
        System.out.println();
    }
}