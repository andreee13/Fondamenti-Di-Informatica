import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    private static Suspect[] suspects = new Suspect[2];

    private static Suspect[] resizeSuspects() {
        Suspect[] newArray = new Suspect[suspects.length * 2];
        System.arraycopy(suspects, 0, newArray, 0, suspects.length);
        return newArray;
    }

    private static void addSuspect(Suspect suspect, int index) {
        if (index >= suspects.length) {
            suspects = resizeSuspects();
        }
        suspects[index] = suspect;
    }

    private static Suspect[] getSuspects(String fileName) throws Exception {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            int i = 0;
            while (scanner.hasNextLine()) {
                addSuspect(new Suspect(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()), i);
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new Exception("Suspects file missing", e);
        } catch (Exception e) {
            throw new Exception("Suspects file badly formatted", e);
        }
        return suspects;
    }

    private static String getDnaSequence(String fileName) throws Exception {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            return scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new Exception("DNA sequence file missing", e);
        } catch (Exception e) {
            throw new Exception("DNA sequence file badly formatted", e);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insert dna file path: ");
            String dnaFileName = scanner.nextLine();
            System.out.print("Insert suspects file path: ");
            String suspectsFileName = scanner.nextLine();
            String dna = getDnaSequence(dnaFileName);
            for (Suspect suspect : getSuspects(suspectsFileName)) {
                if (suspect != null && suspect.checkCompatibility(dna)) {
                    System.out.printf("Match found with %s\n", suspect);
                    return;
                }
            }
            System.out.println("Scan completed, no match found");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
