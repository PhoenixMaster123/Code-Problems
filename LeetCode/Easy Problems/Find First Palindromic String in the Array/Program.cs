
internal class Program
{
    private static void Main(string[] args)
    {
        string[] words = { "abc", "car", "ada", "racecar", "cool" };

        Console.WriteLine(FirstPalindrome(words));
    }

    private static string FirstPalindrome(string[] words)
    {
        ////////////////////////////////////// Variant 1 /////////////////////////////////
        foreach (string i in words)
            if (i == new string(i.Reverse().ToArray()))
                return i;

        return "";
        ////////////////////////////////////// Variant 2 /////////////////////////////////
        // return words.FirstOrDefault(x => x == string.Concat(x.Reverse())) ?? "";
    }
}
/*
-> in Java : 
        for(String word : words)
        {
            StringBuilder reversed = new StringBuilder(word).reverse();
            if(word.equals(reversed.toString()))
            {
                return word;
            }
        }
        return "";
*/
