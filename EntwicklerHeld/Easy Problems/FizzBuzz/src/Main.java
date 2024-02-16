import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(fizzbuzz(number));
    }
    
    static String fizzbuzz(int number) 
    {
        if (number % 3 != 0 && number % 5 != 0) 
        {
            return String.valueOf(number);
        } 
        else if (number % 3 == 0 && number % 5 == 0) 
        {
            return "fizzbuzz";
        } 
        else if (number % 3 == 0) 
        {
            return "fizz";
        } 
        else 
        {
            return "buzz";
        }
    }
}
