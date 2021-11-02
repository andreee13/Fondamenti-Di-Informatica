import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int cycle = 0;
        while (a % 2 != 0) {
            cycle++;
            System.out.print("Insert even number: ");
            if ((a = scanner.nextInt()) % 2 != 0) {
                System.out.println("The number is odd");
                if (cycle > 2) {
                    System.out.println("You are so bad...");
                }
            }
        }
        scanner.close();
        System.out.printf("Nice one! The number %d is even", a);
    }
}
