import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n = scanner.nextInt();
        System.out.print("Enter second number: ");
        int m = scanner.nextInt();
        scanner.close();
        if (n < 0 || m < 0) {
            throw new Exception("Negative number are not allowed");
        }
        if (m > n) {
            throw new Exception("Second number must be less than first number");
        }
        while (m % n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        System.out.printf("MCD: %d\n", n);
    }
}
