package numbers;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(4, 6));
        System.out.println(isEven(3));
        System.out.println(max(5, 5, 9));
        System.out.println(convertTemperature(100));
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int max(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

    public static double convertTemperature(double tempC){
        return tempC * 9/5 +32;
    }
}
