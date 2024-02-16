import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String firstWord = "aab";
        String secondWord = "baa";
        System.out.println(isAnagram(firstWord, secondWord));
    }

    private static boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        boolean isFound = true;
        char[] arr = firstWord.toCharArray();
        char[] arr2 = secondWord.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    arr2[j] = ' ';
                    isFound = true;
                    break;
                }
                isFound = false;
            }
            if (!isFound) {
                return false;
            }
        }
        return isFound;
    }
}
    ///////////////////////////////////// Variant 2 - Besser ///////////////////////////
  /*  
        boolean anagram = false;

        if(firstWord.length() == secondWord.length())
        {
            
        char[] firstChar = firstWord.toCharArray();
        char[] secondChar = secondWord.toCharArray();

        Arrays.sort(firstChar);
        Arrays.sort(secondChar);

        anagram = Arrays.equals(firstChar, secondChar);
    }
        return anagram;
}
/*

///////////////////////////////////// Variant - C# ///////////////////////////////////

/*
    return String.Concat(firstWord.OrderBy(x => x)).Equals(String.Concat(secondWord.OrderBy(x => x)));
/*
