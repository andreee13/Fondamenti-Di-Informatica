import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert your name: ");
        System.out.println("Hello, "  + scanner.nextLine());
        scanner.close();
    }
}
