package condition;

public class Main {
    public static void main(String[] args) {
        System.out.println(signNumbers(0));
        System.out.println(isLeap(4));
        System.out.println(ticketPrice(4));
    }

    public static String signNumbers(int number){
        if(number > 0) {
            return "positive";
        } else if(number < 0){
            return "negative";
        } else{
            return "zero";
        }
    }

    public static boolean isLeap(int year){
        if (year % 400 == 0){
            return true;
        } else if(year % 100 == 0){
            return false;
        } else{
            return year % 4 == 0;
        }
    }

    public static int ticketPrice(int age){
        if (age < 6){
            return 0;
        } else if (age <= 17){
            return 50;
        } else if (age <= 64){
            return 100;
        } else {
            return 60;
        }
    }
}
