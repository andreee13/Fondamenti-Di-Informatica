import java.io.File;
import java.util.Scanner;

//TODO

public class App {

    private static void insertStudent(Student[] students, Student student) {

    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("students.txt"));
        Student[] students = new Student[5];
        while (scanner.hasNextLine()) {
            String[] student = scanner.nextLine().split(", ");
            insertStudent(students,
                    new Student(student[0], Integer.parseInt(student[1]), Integer.parseInt(student[2])));
        }
        scanner.close();
        String input;
        scanner = new Scanner(System.in);
        while (true) {
            input = scanner.nextLine();
            switch (input) {
                case "S":

                    break;
                case "Q":
                    scanner.close();
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.err.println("Invalid command");
                    break;
            }
        }
    }
}
