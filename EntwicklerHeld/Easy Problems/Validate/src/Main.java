import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        String clientNumber = "3456848879";
        System.out.println(validateClientNumber(clientNumber));
    }
        public static boolean validateClientNumber(String clientNumber) {
            int counter = 0;
            char[] pass = clientNumber.toCharArray();
            for (int i = 0; i < pass.length; i++) {
                if (pass[i] < '0' && pass[i] > '9') {
                    return false;
                }
            }

            long number = Long.parseLong(clientNumber);
            String binary = Long.toBinaryString(number);
            char[] num = binary.toCharArray();

            for (int i = 0; i < num.length; i++) {
                if (num[i] == '1') {
                    counter++;
                }
            }
            if (clientNumber.length() == 10 && counter % 2 == 0) {
                return true;
            }
            return false;
        }

    }