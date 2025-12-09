package strings;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("Суетология"));
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
    }

    private static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s).reverse();
        return sb.toString();
    }

    private static boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
