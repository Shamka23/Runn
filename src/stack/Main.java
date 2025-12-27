package stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.isEmpty();

        stack.push(10);
        stack.pop();

        stack.pushAll(List.of(1, 2, 3,5));
        List<Object> out = new ArrayList<>();
        stack.popAll(out);
    }
}
