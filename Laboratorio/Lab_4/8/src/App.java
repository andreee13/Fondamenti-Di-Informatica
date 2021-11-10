import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert string: ");
        String input = scanner.nextLine();
        scanner.close();
        for (int i = input.length(); i > 0; i--) {
            System.out.print(input.charAt(i - 1));
        }
    }
}
