import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
        int p = Level.EXPERT.getPoints();
        System.out.println(p);
        Rect rectangle1 = new Rect(2, 7);
        rectangle1.getPerimeter();
        rectangle1.getArea();
    }

    enum Level {
        EASY(1),
        MEDIUM(2),
        HARD(3),
        EXPERT(5);

        private final int points;

        Level(int points) {
            this.points = points;
        }

        public int getPoints(){
            return points;
        }
    }


}
