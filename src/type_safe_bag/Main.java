package type_safe_bag;

public class Main {
    public static void main(String[] args) {
        TypeSafeBag bag = new TypeSafeBag();

        bag.put(Integer.class, 123);
        bag.put(CharSequence.class, "hello");
        bag.put(String.class, "Огурец");

        System.out.println(bag.get(Integer.class).get());
        System.out.println(bag.get(Integer.class).isEmpty());
        System.out.println(bag.get(String.class).get());

    }
}
