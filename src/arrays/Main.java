package arrays;

public class Main {
    private static void main(String[] args) {
        int[] array = {5, 52, 62, 96, 8};
        int[] array2 = {4, -6, -29, 609, 203};
        System.out.println(min(array));
        System.out.println(sumEven(array));
        System.out.println(countPositives(array2));
    }

    private static int min(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    private static int sumEven(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }

    private static int countPositives(int[] array){
        int count = 0;
        for(int i : array){
            if (i > 0){
                count++;
            }
        }
        return count;
    }
}
