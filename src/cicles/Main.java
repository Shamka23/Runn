package cicles;

public class Main {
    public static void main(String[] args) {
        System.out.println(getSumFromOneToNum(4));
        System.out.println(getRowMultiplicationTable(120));
        System.out.println(getDigitsCount(-12345));
    }

    private static long getSumFromOneToNum(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    private static String getRowMultiplicationTable(int number){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10 ; i++) {
            sb.append(number).append(" * ").append(i).append(" = ").append(number * i).append("\n");
        }
        return sb.toString();
    }

    private static int getDigitsCount(int number) {
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
