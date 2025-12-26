package methods;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFactorial(-723));
        System.out.println(isPrime(7));
    }

    private static int getFactorial(int number) {
        if (number == 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

