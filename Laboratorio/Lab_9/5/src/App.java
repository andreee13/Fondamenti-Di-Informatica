import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {

    private static String reverseString(String s) {
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t += s.charAt(i);
        }
        return t;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert input file name: ");
        String inputFileName = scanner.nextLine();
        System.out.print("Insert output file name: ");
        String outputFileName = scanner.nextLine();
        scanner.close();
        try (Scanner inputFile = new Scanner(new File(inputFileName))) {
            try (PrintWriter outputFile = new PrintWriter(outputFileName)) {
                while (inputFile.hasNextLine()) {
                    outputFile.println(reverseString(inputFile.nextLine()));
                }
                outputFile.close();
            } catch (Exception e) {
                System.err.println("Cannot write output file");
            }
            inputFile.close();
        } catch (Exception e) {
            System.err.println("Cannot read input file");
        }
    }
}
