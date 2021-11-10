import java.util.Scanner;

public class App {

    private static String a, b, c;

    private static void printString() {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            System.out.println(a);
            a = "";
        } else {
            if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
                System.out.println(b);
                b = "";
            } else {
                System.out.println(c);
                c = "";
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        a = scanner.nextLine();
        System.out.print("Enter a string: ");
        b = scanner.nextLine();
        System.out.print("Enter a string: ");
        c = scanner.nextLine();
        scanner.close();
        printString();
        printString();
        printString();
    }
}
