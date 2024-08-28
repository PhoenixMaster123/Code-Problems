import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "LVIII";

        System.out.println(romanToInt(input));
    }

    private static int romanToInt(String input) {
        ////////////////////////////////////// Variant 2 ///////////////////////////
        int sum = 0;
        char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'I') {
                if (i + 1 < ch.length && (ch[i + 1] == 'V' || ch[i + 1] == 'X')) {
                    sum -= 1;
                } else {
                    sum += 1;
                }
            } else if (ch[i] == 'V') {
                sum += 5;
            } else if (ch[i] == 'X') {
                if (i + 1 < ch.length && (ch[i + 1] == 'L' || ch[i + 1] == 'C')) {
                    sum -= 10;
                } else {
                    sum += 10;
                }
            } else if (ch[i] == 'L') {
                sum += 50;
            } else if (ch[i] == 'C') {
                if (i + 1 < ch.length && (ch[i + 1] == 'D' || ch[i + 1] == 'M')) {
                    sum -= 100;
                } else {
                    sum += 100;
                }
            } else if (ch[i] == 'D') {
                sum += 500;
            } else {
                sum += 1000;
            }
        }
        return sum;
    }
}
        ////////////////////////////////// Variant 1 ////////////////////////
        /*
        char one = 'I';
        String four = "IV";
        char five = 'V';
        String nine = "IX";
        char ten = 'X';
        String forty = "XL";
        char fifty = 'L';
        String ninety = "XC";
        char hundred = 'C';
        String fourHundred = "CD";
        char fiveHundred = 'D';
        String neunHundred = "CM";
        char tausend = 'M';
        int result = 0;

        for (int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == tausend)
            {
                result += 1000;
            }
            else if(input.contains(neunHundred))
            {
                result += 900;
                input = input.replace("CM", "");
                i--;
            }
            else if(input.charAt(i) == fiveHundred)
            {
                result += 500;
            }
            else if(input.contains(fourHundred))
            {
                result += 400;
                input = input.replace("CD", "");
                i--;
            }
            else if(input.charAt(i) == hundred)
            {
                result += 100;
            }
            else if(input.contains(ninety))
            {
                result += 90;
                input = input.replace("XC", "");
                i--;
            }
            else if(input.charAt(i) == fifty)
            {
                result += 50;
            }
            else if(input.contains(forty))
            {
                result += 40;
                input = input.replace("XL", "");
                i--;
            }
            else if(input.charAt(i) == ten)
            {
                result += 10;
            }
            else if(input.contains(nine))
            {
                result += 9;
                input = input.replace("IX", "");
                i--;
            }
            else if(input.charAt(i) == five)
            {
                result += 5;
            }
            else if(input.contains(four))
            {
                result += 4;
                input = input.replace("IV", "");
                i--;
            }
            else if(input.charAt(i) == one)
            {
                result += 1;
            }
        }

        return result;

    }

}
 */