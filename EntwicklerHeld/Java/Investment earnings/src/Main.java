import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your buying price per share:");
        double buyingPrice = scanner.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        while (true)
        {
            System.out.println("Enter closing price for day:" + day +
                               " (any negative value to leave): ");

            closingPrice = scanner.nextDouble();
            if(closingPrice < 0.0)
            {
                break;
            }
            double earnings = closingPrice - buyingPrice;

            if (earnings > 0.0)
            {
                System.out.println("After day " + day + " , you earned " + decimalFormat.format(earnings) + " per share.");
            } else if (earnings < 0.0) {
                System.out.println("After day " + day + " , you lost " + decimalFormat.format(-earnings) + " per share.");
            }
            else
            {
                System.out.println("After day " + day + " you have no earnings per share.");
            }
            day++;
        }
        scanner.close();
    }
}