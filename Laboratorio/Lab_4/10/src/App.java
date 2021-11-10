import java.util.Scanner;

public class App {

    private static char switchDna(char c) throws Exception {
        switch (c) {
        case 'A':
            return 'T';
        case 'T':
            return 'A';
        case 'C':
            return 'G';
        case 'G':
            return 'C';
        default:
            throw new Exception("Invalid DNA sequence");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert DNA sequence: ");
        String s = scanner.nextLine();
        scanner.close();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            sb.append(switchDna(s.charAt(i - 1)));
        }
        System.out.println(sb.toString());
    }
}
