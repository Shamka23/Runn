package numbers;

public class Main {
    public static void main(String[] args) {
        System.out.println(getSum(4, 6));
        System.out.println(isEven(3));
        System.out.println(getMax(10, 12, 9));
        System.out.println(getFahrenheitTemp(100));
    }

    private static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static int getMax(int firstNumber, int secondNumber, int thirdNumber) {
        return Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
//        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
//            return firstNumber;
//        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
//            return secondNumber;
//        } else {
//            return thirdNumber;
//        }
    }

    private static double getFahrenheitTemp(double tempC) {
        return 1.8 * tempC + 32;
    }
}
