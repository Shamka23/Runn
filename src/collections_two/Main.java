package collections_two;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(freqLetters("abBA!"));

        Set<Integer> x = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> y = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println(intersect(x, y));

        Map<String, Integer> map = new HashMap<>();
        map.put("dog", 5);
        map.put("cat", 5);
        map.put("mouse", 7);
        map.put("crocodile", 3);

        List<Map.Entry<String, Integer>> top2 = topK(map, 2);

        for(Map.Entry<String, Integer> entry : top2){
            System.out.println(entry.getKey() +  " = " + entry.getValue());
        }
    }

    private static Map<Character, Integer> freqLetters(String text) {
        Map<Character, Integer> result = new HashMap<>();
        for (Character symbol : text.toLowerCase().toCharArray()) {
            if (isLatin(symbol)) {
                Integer value = result.get(symbol);
                if (value != null) {
                    result.put(symbol, value + 1);
                } else {
                    result.put(symbol, 1);
                }
            }
        }
        return result;
    }

    private static boolean isLatin(char symbol) {
        return symbol >= 'a' && symbol <= 'z';
    }

    private static Set<Integer> intersect(Set<Integer> x, Set<Integer> y) {
        Set<Integer> result = new HashSet<>(x);
        result.retainAll(y);
        return result;
    }

    private static List<Map.Entry<String, Integer>> topK(Map<String, Integer> map, int k) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                int byValue = Integer.compare(e2.getValue(), e1.getValue());

                if (byValue != 0){
                    return byValue;
                } else {
                    return e1.getKey().compareTo(e2.getKey());
                }
            }
        });
        return entries.subList(0, Math.min(k, entries.size()));
    }
}
