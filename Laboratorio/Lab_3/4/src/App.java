import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert words separated by space: ");
        String[] words = scanner.nextLine().split(" ");
        scanner.close();
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word).append('\n');
        }
        System.out.println(stringBuilder.reverse().toString());
    }
}
