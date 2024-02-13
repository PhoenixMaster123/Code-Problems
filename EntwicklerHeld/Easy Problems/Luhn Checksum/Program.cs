
using System.Diagnostics.Metrics;

internal class Program
{
    private static void Main(string[] args)
    {
        string number = "0000 0";

        Console.WriteLine(IsValid(number.Trim()));
    }

    public static Boolean IsValid(string number)
    {
        if (number.Length <= 1)
        {
            return false;
        }

        char[] ch = number.ToCharArray();
        Array.Reverse(ch);
        int sum = 0;
        int counter = 1;

        for (int i = 0; i < ch.Length; i++)
        {
            if (ch[i] == ' ')
            {
                continue;
            }
            else if (!char.IsDigit(ch[i]))
            {
                return false;
            }
            else
            {
                int digit = int.Parse(ch[i].ToString());
                if (counter % 2 == 0)
                {
                    digit *= 2;
                    if (digit > 9)
                    {
                        digit -= 9;
                    }
                    sum += digit;
                }
                else
                {
                    sum += digit;
                }
                counter++;
            }
        }
        return sum % 10 == 0;
    }
}