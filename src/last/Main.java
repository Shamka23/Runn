package last;

public class Main {
    public static void main(String[] args) {
        System.out.println(parseOrDefault("123", 0));
    }

    private static int parseOrDefault(String text, int def){
        try{
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return def;
        }
    }
}
