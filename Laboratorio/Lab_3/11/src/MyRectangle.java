public class MyRectangle {

    private int posX, posY, width, height;

    public MyRectangle(int posX, int posY, int width, int height) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void resize(double sizeFactor) {
        width *= sizeFactor;
        height *= sizeFactor;
    }

    public void translate(int dx, int dy) {
        posX += dx;
        posY += dy;
    }

    @Override
    public String toString() {
        return String.format("Rectagle: x=%d, y=%d, w=%d, h=%d", posX, posY, width, height);
    }

}
