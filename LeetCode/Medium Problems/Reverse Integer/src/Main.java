public class Main {
    public static void main(String[] args) {
        int num = 1534236469;

        System.out.println(reverse(num));
    }


    public static int reverse(int x) {
        if (x < Integer.MAX_VALUE && x > Integer.MIN_VALUE) {
            StringBuilder builder = new StringBuilder();
            int result = 0;
            if (x < 0) {
                String num = String.valueOf(x);
                char[] ch = num.toCharArray();
                for (int i = 1; i <= ch.length - 1; i++) {
                    builder.append(ch[i]);
                }
                builder.append(ch[0]);
                builder.reverse();
                try {
                    result = Integer.parseInt(String.valueOf(builder));
                } catch (Exception exception) {
                    return 0;
                }
                return result;
            } else {
                builder = new StringBuilder(String.valueOf(x));
                builder.reverse();
                try {
                    result = Integer.parseInt(String.valueOf(builder));
                } catch (Exception exception) {
                    return 0;
                }
                return result;
            }
        } else {
            return 0;
        }
    }
}
