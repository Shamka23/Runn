package cicles;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumToN(4));
        System.out.println(mulRow(120));
        System.out.println(digitsCount(-12345));
    }

    public static long sumToN(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static String mulRow(int number){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10 ; i++) {
            sb.append(number).append(" * ").append(i).append(" = ").append(number * i).append("\n");
        }
        return sb.toString();
    }

    public static int digitsCount(int number) {
        number = Math.abs(number);
        if(number == 0){
            return 1;
        }
        int count = 0;
        while(number > 0){
            number /= 10;
            count++;
        }
        return count;
    }
}
