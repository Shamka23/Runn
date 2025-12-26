package classes;

public class Rect {

    private final int width;
    private final int height;

    public Rect(int width, int height) {
        if (width <= 0 || height <= 0){
            throw new IllegalArgumentException(
                    "Длина или высота прямоугольника не может быть меньше или равняться нулю"
            );
        }
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return width * height;
    }

    public int getPerimeter(){
        return (width + height) * 2;
    }
}
