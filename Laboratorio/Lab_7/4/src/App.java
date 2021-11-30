import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert input file name: ");
        String inputName = scanner.nextLine();
        System.out.print("Insert output file name: ");
        String outputName = scanner.nextLine();
        scanner.close();
        try (FileReader inputFileReader = new FileReader(inputName);
                Scanner inputScanner = new Scanner(inputFileReader).useDelimiter("['\\s]+");
                PrintWriter printWriter = new PrintWriter(outputName)) {
            while (inputScanner.hasNext()) {
                String s = inputScanner.next();
                printWriter.printf("%c%s ", Character.toUpperCase(s.charAt(0)),
                        s.substring(1, s.length()).toLowerCase());
            }
            inputScanner.close();
            inputFileReader.close();
            printWriter.close();
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Cannot open or create the files");
        }
    }
}
