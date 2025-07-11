internal class Program
{
    private static void Main(string[] args)
    {
        int number = int.Parse(Console.ReadLine());

        Console.WriteLine(CountStepsToOne(number));
    }
        public static int CountStepsToOne(int number)
        {
            if (number <= 0)
            {
                throw new ArgumentOutOfRangeException();
            }
            int count = 0;
            while (number != 1)
            {
                if (number % 2 == 0)
                {
                    number /= 2;
                }
                else
                {
                    number = number * 3 + 1;
                }
                count++;
            }
            return count;
        }
    }