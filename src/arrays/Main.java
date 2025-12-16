package arrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 129, 3, 4};
        reverseInPlace(array);
        System.out.println(indexOf(array, 129));

        int[] firstArray = {1, 3, 5};
        int[] secondArray = {2, 4, 6};
        System.out.println(Arrays.toString(mergeSorted(firstArray, secondArray)));

        int[] arrayHashSet = {1, 2, 1, 3, 2};
        System.out.println(Arrays.toString(unigue(arrayHashSet)));
    }

    public static void reverseInPlace(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static int indexOf(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int[] mergeSorted(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];

        int i = 0, j = 0, k = 0;

        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] <= secondArray[j]) {
                result[k++] = firstArray[i++];
            } else {
                result[k++] = secondArray[j++];
            }
        }

        while (i < firstArray.length) {
            result[k++] = firstArray[i++];
        }

        while (j < secondArray.length) {
            result[k++] = secondArray[j++];
        }
        return result;
    }

    public static int[] unigue(int[] array) {
//        LinkedHashSet<Integer> unigueSet = new LinkedHashSet<>();
//        for (int element : array) {
//            unigueSet.add(element);
//        }
//        int[] result = new int[unigueSet.size()];
//        int i = 0;
//
//        for (int element : unigueSet) {
//            result[i++] = element;
//        }
//        return result;

        Set<Integer> seen = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        for (int element : array) {
            if (!seen.contains(element)) {
                seen.add(element);
                resultList.add(element);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
