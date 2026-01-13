package sortedbag;

import java.util.*;

public final class SortedBag<T extends Comparable<? super T>> {
    private final TreeMap<T, Integer> map = new TreeMap<>();
    private int size = 0;

    public void add(T value){
        map.put(value, map.getOrDefault(value, 0) + 1);
        size++;
    }

    public int getCount(T value){
        return map.getOrDefault(value, 0);
    }

    public int getSize(){
        return size;
    }

    public boolean removeOne(T value) {
        Integer cnt = map.get(value);
        if(cnt == null) {
            return false;
        }

        if(cnt == 1) {
            map.remove(value);
        } else {
            map.put(value, cnt - 1);
        }

        size--;
        return true;
    }
    public T min() {
        if (map.isEmpty()) {
            throw new NoSuchElementException();
        }
        return map.firstKey();
    }

    public T max() {
        if (map.isEmpty()) {
            throw new NoSuchElementException();
        }
        return map.lastKey();
    }

    public List<T> toList() {
        List<T> result = new ArrayList<>(size);
        for (Map.Entry<T, Integer> e : map.entrySet()) {
            for (int i = 0; i < e.getValue(); i++) {
                result.add(e.getKey());
            }
        }
        return result;
    }
}
