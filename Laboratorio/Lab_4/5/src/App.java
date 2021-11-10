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
        for (int i = 1; i < max+1; i++) {
            System.out.print(i + " ");
        }
    }
}
