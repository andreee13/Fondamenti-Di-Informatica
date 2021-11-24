import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(scanner.nextLine());
        scanner.close();
        while(scanner2.hasNext()) {
            System.out.println(scanner2.next());
        }
        scanner2.close();
    }
}
