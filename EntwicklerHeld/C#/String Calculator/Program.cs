using System;

namespace MathExpressionEvaluator
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                string input1 = "What is 5?";
                Console.WriteLine($"Result for '{input1}': {Answer(input1)}");

                string input2 = "What is 1 plus 1?";
                Console.WriteLine($"Result for '{input2}': {Answer(input2)}");

                string input3 = "What is 53 plus 2?";
                Console.WriteLine($"Result for '{input3}': {Answer(input3)}");

                string input4 = "What is 4 minus -12?";
                Console.WriteLine($"Result for '{input4}': {Answer(input4)}");

                string input5 = "What is -3 multiplied by 25?";
                Console.WriteLine($"Result for '{input5}': {Answer(input5)}");

                string input6 = "What is 33 divided by -3?";
                Console.WriteLine($"Result for '{input6}': {Answer(input6)}");

                // Add more test cases as needed
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine($"Error: {ex.Message}");
            }
        }

        private static double Answer(string text)
        {
            // Remove unnecessary words and keep only the expression
            // Remove unnecessary words and keep only the expression
            string expression = text
                .Replace("What is", "")
                .Replace("?", "")
                .Trim();

            // Handle simple cases where the expression is a single number
            if (double.TryParse(expression, out double result))
            { 
                return result; 
            }
            else
            { 
                throw new ArgumentException("Invalid input"); 
            }


        // Handle chained operations (ignore order of operations)
        string[] operators = { "plus", "minus", "multiplied", "divided" };
            string[] parts = expression.Split(' ');

            double ergebniss = 0;
            double currentNumber = 0;
            string currentOperator = "";

            foreach (string part in parts)
            {
                if (double.TryParse(part, out double num))
                {
                    if (currentOperator == "")
                        currentNumber = num;
                    else
                    {
                        switch (currentOperator)
                        {
                            case "plus":
                                result += currentNumber;
                                break;
                            case "minus":
                                result -= currentNumber;
                                break;
                            case "multiplied":
                                result *= currentNumber;
                                break;
                            case "divided":
                                result /= currentNumber;
                                break;
                        }
                        currentNumber = num;
                    }
                }
                else if (Array.Exists(operators, op => op == part))
                    currentOperator = part;
                else
                    throw new ArgumentException("Invalid input");
            }

            // Apply the last operation
            switch (currentOperator)
            {
                case "plus":
                    result += currentNumber;
                    break;
                case "minus":
                    result -= currentNumber;
                    break;
                case "multiplied":
                    result *= currentNumber;
                    break;
                case "divided":
                    result /= currentNumber;
                    break;
            }

            return result;
        }
    }
}
