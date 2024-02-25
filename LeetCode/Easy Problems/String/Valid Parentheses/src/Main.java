import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            if (sc == '(' || sc == '[' || sc == '{')
            {
                stack.push(sc);
            }
            else if (sc == ')')
            {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else if (sc == '}')
            {
                if (!stack.isEmpty() && stack.peek() == '{')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else if (sc == ']')
            {
                if (!stack.isEmpty() && stack.peek() == '[')
                {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}