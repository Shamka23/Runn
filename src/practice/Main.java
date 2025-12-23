package practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isStrong("1234567a"));
        System.out.println(Arrays.toString(charFreqLowerCase("abAB!")));
    }

    private static boolean isStrong(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasLetter = false;
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) hasLetter = true;
            if (Character.isDigit(password.charAt(i))) hasDigit = true;
            if (hasLetter && hasDigit) break;
        }
        return hasLetter && hasDigit;
    }

    private static int[] charFreqLowerCase(String word){
        int[] freq = new int[26];

        for (char ch : word.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if(ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
        return freq;
    }
}
