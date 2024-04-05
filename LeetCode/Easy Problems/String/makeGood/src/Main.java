import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String s = "Pp";
        System.out.println(makeGood(s));
    }


    ///////////////////////////////////// Solution 1 - Optimized /////////////////////////////
    private static String makeGood(String s) {
        StringBuilder builder = new StringBuilder();
        int index = 0;

        for (char ch : s.toCharArray()) {
            if (index > 0 && Math.abs(ch - builder.charAt(index - 1)) == 32) {
                builder.deleteCharAt(index - 1);
                index--;
            } else {
                builder.append(ch);
                index++;
            }
        }

        return builder.toString();
    }
    ///////////////////////////////////// Solution 2 - first attempt /////////////////////////////
   /* private static String makeGood(String s)
    {
        StringBuilder builder  = new StringBuilder();
        char[] ch = s.toCharArray();
        List<Character> list = new ArrayList<>();

        for (Character character : ch)
        {
            list.add(character);
        }
        int index = 0;
       while (index < list.size() || !list.isEmpty())
       {
           if(index + 1 == list.size())
           {
               break;
           }
            if( (int) (list.get(index)) - 32 == (int) list.get(index + 1) || (int) (list.get(index)) + 32 == (int) list.get(index + 1))
            {
                list.remove(index);
                list.remove(index);
                if (index > 0) // Check if we need to go back
                    index--;
            }
            else
            {
                index++;
            }

        }
       if(list.isEmpty())
       {
           return "";
       }
       else
       {
           for (Character characters : list) {
               builder.append(characters);
           }
           return builder.toString();
       }
    }

    */
}