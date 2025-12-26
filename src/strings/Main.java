package strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getReverseString("Суетология"));
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
        System.out.println(getReverseInteger(1230));
    }

    private static String getReverseString(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text).reverse();
        return stringBuilder.toString();
    }

    private static String getReverseInteger(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        String text = String.valueOf(number);
        stringBuilder.append(text).reverse();
        return stringBuilder.toString();
    }

    private static boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
}
