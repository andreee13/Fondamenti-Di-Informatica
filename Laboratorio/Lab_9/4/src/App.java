import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert numeric triple for square 1: ");
        String[] input1 = scanner.nextLine().split(" ");
        System.out.print("Insert numeric triple for square 2: ");
        String[] input2 = scanner.nextLine().split(" ");
        Square square1 = new Square(Integer.parseInt(input1[0]), Integer.parseInt(input1[1]),
                Integer.parseInt(input1[2]));
        Square square2 = new Square(Integer.parseInt(input2[0]), Integer.parseInt(input2[1]),
                Integer.parseInt(input2[2]));
        if (square1.getArea() < square2.getArea()) {
            System.out.printf("%s\n%s", square1, square2);
        } else {
            System.out.printf("%s\n%s", square2, square1);
        }
        System.out.print("Insert new width and height for square 1: ");
        input1 = scanner.nextLine().split(" ");
        System.out.print("Insert new width and height for square 2: ");
        input2 = scanner.nextLine().split(" ");
        scanner.close();
        square1.setSize(Integer.parseInt(input1[0]), Integer.parseInt(input1[1]));
        square2.setSize(Integer.parseInt(input2[0]), Integer.parseInt(input2[1]));
        System.out.printf("%s\n%s", square1, square2);
    }
}
