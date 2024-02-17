public class Main {
    public static void main(String[] args) {
        int num = 20;

        System.out.println(IntToRoman(num));
        
    }

    private static String IntToRoman(int num)
    {
        String str = "";
        int result = num;
        while (result > 0)
        {
            if (result < 4)
            {
                str += "I";
                result -= 1;
            } else if (result == 4) 
            {
                str += "IV";
                result -= 4;
            } else if (result >= 5 && result < 9)
            {
                str += "V";
                result -= 5;
            } else if (result == 9)
            {
                str += "IX";
                result -= 9;
            }
            else if (result >= 10 && result < 40)
            {
                str += "X";
                result -= 10;
            }
            else if (result >= 40 && result < 50)
            {
                str += "XL";
                result -= 40;
            }
            else if (result >= 50 && result < 90)
            {
                str += "L";
                result -= 50;
            } else if (result >= 90 && result < 100)
            {
                str += "XC";
                result -= 90;
            }
            else if (result >= 100 && result < 400)
            {
                str += "C";
                result -= 100;
            }
            else if (result >= 400 && result < 500)
            {
                str += "CD";
                result -= 400;
            }
            else if (result >= 500 && result < 900)
            {
                str += "D";
                result -= 500;
            }
            else if (result >= 900 && result < 1000)
            {
                str += "CM";
                result -= 900;
            } else if (result >= 1000)
            {
                str += "M";
                result -= 1000;
            }
        }
        return str;
    }
}