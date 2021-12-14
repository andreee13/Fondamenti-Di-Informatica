import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert parameter a: ");
        double a = scanner.nextDouble();
        System.out.print("Insert parameter b: ");
        double b = scanner.nextDouble();
        System.out.print("Insert parameter c: ");
        double c = scanner.nextDouble();
        scanner.close();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.hasSolutions()) {
            System.out.printf("First solution: %f\nSecond solution: %f", quadraticEquation.getSolution1(),
                    quadraticEquation.getSolution2());
        } else {
            System.out.println("Equation has no solutions");
        }
    }
}
