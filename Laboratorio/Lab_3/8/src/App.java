import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert adjective: ");
        String adjective = scanner.nextLine();
        scanner.close();
        System.out.println(adjective.substring(0, 1).toUpperCase() + adjective.substring(1));
        System.out.println(adjective.substring(0, adjective.length()-1) + (adjective.charAt(adjective.length()-1) == 'o' ? "ino" : "ina"));
        System.out.println(adjective.substring(0, adjective.length()-1) + (adjective.charAt(adjective.length()-1) == 'o' ? "issimo" : "issima"));
    }
}
