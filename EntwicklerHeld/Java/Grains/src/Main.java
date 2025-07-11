import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println(grainsOnSquare(number));
        System.out.println(grainsOnBoard());
    }
        static BigInteger grainsOnSquare(final int square) {
            if(square < 1 || square > 64)
            {
                throw new IllegalArgumentException("square must be between 1 and 64");
            }
            else
            {
                return BigInteger.valueOf(2).pow(square - 1);
            }
        }

        static BigInteger grainsOnBoard()
        {
            BigInteger totalGrains = BigInteger.ZERO;
            for (int i = 1; i <= 64; i++)
            {
                totalGrains = BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
            }
            return totalGrains;
        }
    }