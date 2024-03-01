import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String s = "0101";

        System.out.println(maximumOddBinaryNumber(s));
    }
        public static String maximumOddBinaryNumber(String s)
        {
            int countOnes = 0;
            char[] ch = s.toCharArray();
            StringBuilder result = new StringBuilder();

            for(int i = 0; i < ch.length; i++)
            {
                if(ch[i] == '1')
                {
                    countOnes++;
                }
            }
            for(int i = 0; i < ch.length - 1; i++)
            {
                if(countOnes > 1)
                {
                    countOnes--;
                    result.append('1');
                }
                else
                {
                    result.append('0');
                }
            }
            result.append('1');
            return result.toString();
        }
    }
