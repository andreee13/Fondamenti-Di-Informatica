import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
        if (year > 0) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap year");
                    } else {
                        System.out.println("Not a leap year");
                    }
                } else {
                    System.out.println("Leap year");
                }
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            System.out.println("Invalid year");
        }
    }
}
