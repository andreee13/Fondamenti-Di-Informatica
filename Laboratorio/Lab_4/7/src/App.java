import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert max: ");
        int max = scanner.nextInt();
        scanner.close();
        if (max < 0) {
            throw new Exception("Max must be greater than 0");
        }
        int maxDigits = String.valueOf(max).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < maxDigits - String.valueOf(i).length(); j++) {
                sb.append(" ");
            }
            sb.append(i + (i % 10 == 0 ? "\n" : " "));
        }
        System.out.println(sb.toString());
    }
}
