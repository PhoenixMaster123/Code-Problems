public class Main {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman));
    }

    private static int romanToInt(String roman) {
        int sum = 0;
        char[] ch = roman.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'I') {
                if (i + 1 < ch.length && (ch[i + 1] == 'V' || ch[i + 1] == 'X')) {
                    sum -= 1;
                } else {
                    sum += 1;
                }
            } else if (ch[i] == 'V') {
                sum += 5;
            } else if (ch[i] == 'X') {
                if (i + 1 < ch.length && (ch[i + 1] == 'L' || ch[i + 1] == 'C')) {
                    sum -= 10;
                } else {
                    sum += 10;
                }
            } else if (ch[i] == 'L') {
                sum += 50;
            } else if (ch[i] == 'C') {
                if (i + 1 < ch.length && (ch[i + 1] == 'D' || ch[i + 1] == 'M')) {
                    sum -= 100;
                } else {
                    sum += 100;
                }
            } else if (ch[i] == 'D') {
                sum += 500;
            } else {
                sum += 1000;
            }
        }
        return sum;
    }
}
