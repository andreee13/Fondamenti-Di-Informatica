import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first time: ");
        int a = scanner.nextInt();
        System.out.print("Insert second time: ");
        int b = scanner.nextInt();
        int aHours = a / 100;
        int bHours = b / 100;

        scanner.close();
        System.out.println(
                (aHours > bHours ? 24 - bHours : bHours - aHours) + " hours and " + Math.abs(((b % 100) - (a % 100))));
    }
}
