import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert words separated by space: ");
        String[] words = scanner.nextLine().split(" ");
        scanner.close();
        for (String word : words) {
            System.out.println(word);
        }
    }
}
