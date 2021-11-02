import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first time: ");
        int a = scanner.nextInt();
        System.out.print("Insert second time: ");
        int b = scanner.nextInt();
        scanner.close();
        System.out.println(((b / 100) - (a / 100)) + " hours and " + Math.abs(((b % 100) - (a % 100))));
    }
}
