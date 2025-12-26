package classes;

public enum Level {
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
