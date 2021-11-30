import java.util.Scanner;

public class App {

    int iterFibonacci() {
        return 0;
    }

    public static void main(String[] args) throws Exception {
        int n;
        if (args.length == 0) {
            System.out.print("Insert a number: ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            scanner.close();
        } else {
            n = Integer.parseInt(args[0]); 
        }

    }
}
