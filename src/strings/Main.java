package strings;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFirstWord("     hi world"));
        System.out.println(repeat("ab", 3));
        System.out.println(maskVowels("Hello Maksim"));
        System.out.println(squeezeSpaces("   a   b      gay"));
    }

    private static String getFirstWord(String text) {
        StringBuilder result = new StringBuilder();
        for (char symbol : text.trim().toCharArray()){
            if(Character.isLetterOrDigit(symbol)){
                result.append(symbol);
            } else break;
        }
        return result.toString();
    }

    private static String repeat(String text, int times){
        StringBuilder repeatWord = new StringBuilder();
        for (int i = 0; i < times; i++) {
            repeatWord.append(text);
        }
        return repeatWord.toString();
    }

    private static String maskVowels(String text) {
        return text.replaceAll("[aiueoAIUEO]", "*");
    }

    private static String squeezeSpaces(String text){
        return text.trim().replaceAll("\\s+", " ");
    }
}
