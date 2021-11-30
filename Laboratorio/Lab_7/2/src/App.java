import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (FileReader fileReader = new FileReader("src/input.txt"); Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
            scanner.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Cannot open file");
        }
    }
}
