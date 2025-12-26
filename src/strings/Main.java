package strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getReverseString("Суетология"));
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
        System.out.println(getReverseInteger(1230));
    }

    private static String getReverseString(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append(text).reverse();
        return sb.toString();
    }

    private static String getReverseInteger(int number) {
        StringBuilder sb = new StringBuilder();
        String text = String.valueOf(number);
        sb.append(text).reverse();
        return sb.toString();
    }

    private static boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
}
