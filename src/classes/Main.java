package classes;

public class Main {

    public static void main(String[] args) {
        int point = Level.EXPERT.getPoints();
        System.out.println(point);
        Rect rectangleFirst = new Rect(2, 7);
        rectangleFirst.getPerimeter();
        rectangleFirst.getArea();
    }
}
