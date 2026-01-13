package Mediana;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    static <T extends Comparable<? super T>> T min(Collection<T> col) {
        Iterator<T> it = col.iterator();
        T min = it.next();

        while (it.hasNext()) {
            T cur = it.next();
            if (cur.compareTo(min) < 0) {
                min = cur;
            }
        }
        return min;
    }

    static <T extends Comparable<? super T>> T max(Collection<T> col) {
        Iterator<T> it = col.iterator();
        T max = it.next();

        while (it.hasNext()) {
            T cur = it.next();
            if (cur.compareTo(max) > 0) {
                max = cur;
            }
        }
        return max;
    }

    static <T> T minComparator(Collection<T> col, Comparator<? super T> cmp) {
        Iterator<T> it = col.iterator();
        T min = it.next();

        while (it.hasNext()) {
            T cur = it.next();
            if (cmp.compare(cur, min) < 0) {
                min = cur;
            }
        }
        return min;
    }

    static <T> T maxComparator(Collection<T> col, Comparator<? super T> cmp) {
        Iterator<T> it = col.iterator();
        T max = it.next();

        while (it.hasNext()) {
            T cur = it.next();
            if (cmp.compare(cur, max) > 0) {
                max = cur;
            }
        }
        return max;
    }

    static <T> Optional<T> median(List<T> list, Comparator<? super T> cmp) {
        if (list.isEmpty()) {
            return Optional.empty();
        }

        List<T> copy = new ArrayList<>(list);
        copy.sort(cmp);

        int idx = (copy.size() - 1)/ 2;
        return Optional.of(copy.get(idx));
    }
}
