import java.awt.Rectangle;

public class Square extends Rectangle {

    public Square(int x, int y, int dimension) {
        super(x, y, dimension, dimension);
    }

    public int getArea() {
        return super.height ^ 2;
    }

    @Override
    public void setSize(int width, int height) {
        if (width != height) {
            throw new IllegalArgumentException();
        }
        super.setSize(width, height);
    }

    public void setSize(int dimension) {
        super.setSize(dimension, dimension);
    }

    @Override
    public String toString() {
        return String.format("%s%s", getClass().getName(), super.toString());
    }

}
