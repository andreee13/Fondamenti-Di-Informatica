import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number: ");
        int a = scanner.nextInt();
        System.out.print("Insert second number: ");
        int b = scanner.nextInt();
        scanner.close();
        System.out.println("Sum: " + (a + b));
        System.out.println("Product: " + (a * b));
        System.out.println("Medium: " + ((a + b) / 2));
        System.out.println("Max: " + (a > b ? a : b));
        System.out.println("Min: " + (a > b ? b : a));
        System.out.println("Absoulute difference: " + ((a - b) > 0 ? a - b : -(a - b)));
    }
}
