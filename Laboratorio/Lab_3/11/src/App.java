public class App {
    public static void main(String[] args) throws Exception {
        MyRectangle rectangle = new MyRectangle(1, 8, 15, 4);
        System.out.println(rectangle);
        rectangle.resize(0.5);
        System.out.println(rectangle);
        rectangle.translate(3, -2);
        System.out.println(rectangle);
    }
}
