public class Main {
    public static void main(String[] args) {

        int x = 122;
        System.out.println(isPalindrom(x));
    }

    private static boolean isPalindrom(int x)
    {
        String result = String.valueOf(x);
        String reverse = new StringBuffer(result).reverse().toString();
       if (result.equals(reverse))
       {
           return true;
       }
       else
       {
       return false;
       }

    }
}