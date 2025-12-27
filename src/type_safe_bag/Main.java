package type_safe_bag;

public class Main {
    public static void main(String[] args) {
        TypeSafeBag bag = new TypeSafeBag();

        bag.put(Integer.class, 123);
        bag.put(CharSequence.class, "hello");
        bag.put(String.class, "Огурец");

        bag.get(Integer.class).get();      // 123
        bag.get(String.class).isEmpty();   // true
        bag.get(String.class).get();

    }
}
