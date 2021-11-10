import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        do {
            System.out.print("Insert number: ");
            sb.append(scanner.nextLine() + " ");
            
        } while (scanner.hasNext());
        scanner.close();
        String[] numbers = sb.toString().split(" ");
        if (numbers.length < 2) {
            throw new Exception("Not enough numbers");
        }
        for (String string : numbers) {
            if (!string.matches("[0-9]+")) {
                throw new Exception("Not a number");
            }
        }
    }
}
