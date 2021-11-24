import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (scanner.hasNext()) {
            try {
                scanner.nextInt();
                counter++;
            } catch (InputMismatchException e) {
                scanner.next();
            }
        }
        scanner.close();
        System.out.printf("Entered %d numbers", counter);
    }
}
