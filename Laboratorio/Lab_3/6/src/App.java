import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number: ");
        float a = scanner.nextFloat();
        System.out.print("Insert second number: ");
        float b = scanner.nextFloat();
        scanner.close();
        System.out.println(Numeric.approxEqual(a, b));
    }
}
