import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Insert second string: ");
        String s2 = scanner.nextLine();
        scanner.close();
        if (s1.equals(s2)) {
            System.out.println(true);
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(0)) {
                    if (s2.length() + i <= s1.length() && s2.equals(s1.substring(i, s2.length() + i))) {
                        System.out.println(true);
                        System.exit(0);
                    }
                }
            }
            System.out.println(false);
        }
    }
}
