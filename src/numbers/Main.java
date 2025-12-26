package numbers;

public class Main {
    public static void main(String[] args) {
        System.out.println(abs(-7));
        System.out.println(isPowerOfTwo(32));
        System.out.println(getFactorial(5));
        System.out.println(safeAvg(10, 8));
    }

    private static int abs(int number) {
        return number < 0 ? -number : number;
    }

    private static boolean isPowerOfTwo(int number) {
        if (number <= 0) {
            return false;
        }
        while (number > 1) {
            if (number % 2 != 0) {
                return false;
            }
            number /= 2;
        } return true;
    }

    private static long getFactorial(int number) {
        long factorial = 1;
        if (number == 0) {
            return factorial;
        }
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static int safeAvg(int firstNumber, int secondNumber) {
        return firstNumber + (secondNumber - firstNumber) / 2;
    }
}
