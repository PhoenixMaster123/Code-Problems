import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    private static String removeDuplicates(String s)
    {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek() == c)
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty())
        {
            builder.append(stack.pop());
        }
        builder.reverse();
        return builder.toString();
    }
}