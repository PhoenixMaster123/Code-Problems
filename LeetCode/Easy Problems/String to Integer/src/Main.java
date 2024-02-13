import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(myAtoi(s));
    }

    private static int myAtoi(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        String trimmed = s.trim(); // Remove leading and trailing whitespace
        if (trimmed.isEmpty()) {
            return 0;
        }

        char[] ch = trimmed.toCharArray();
        int sign = 1;
        int i = 0;

        // Check for sign
        if (ch[i] == '+' || ch[i] == '-') {
            sign = (ch[i++] == '-') ? -1 : 1;
        }

        long result = 0; // Use long to handle overflow situations

        // Process digits
        while (i < ch.length && ch[i] >= '0' && ch[i] <= '9') {
            result = result * 10 + (ch[i++] - '0');

            // Check for overflow
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) (result * sign);
    }
}
