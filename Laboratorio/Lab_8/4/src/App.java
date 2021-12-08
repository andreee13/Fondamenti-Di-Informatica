import java.io.File;
import java.util.Scanner;

public class App {

    private static Student[] students = new Student[5];

    private static Student[] resize(Student[] array) {
        Student[] newArray = new Student[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    private static void insertStudent(int index, Student student) {
        if (index >= students.length) {
            students = resize(students);
        }
        students[index] = student;
    }

    private static String search(String name) {
        for (Student student : students) {
            if (student != null && student.getName().equals(name)) {
                return String.format("%s's final vote: %d", student.getName(),
                        (student.getOralVote() + student.getWrittenVote()) / 2);
            }
        }
        return String.format("Student %s not found", name);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("bin/students.txt"));
        int counter = 0;
        while (scanner.hasNextLine()) {
            String[] student = scanner.nextLine().split(",");
            try {
                insertStudent(
                        counter,
                        new Student(
                                student[0],
                                Integer.parseInt(student[1]),
                                Integer.parseInt(student[2])));
            } catch (Exception e) {
                continue;
            }
            counter++;
        }
        System.out.printf("%d students loaded in database\n", counter);
        scanner.close();
        scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Insert command (S, Q): ");
            input = scanner.nextLine();
            switch (input) {
                case "S":
                    System.out.print("Insert student name: ");
                    System.out.println(search(scanner.nextLine()));
                    break;
                case "Q":
                    break;
                default:
                    System.err.println("Invalid command");
                    break;
            }
        } while (!input.equals("Q"));
        scanner.close();
        System.out.println("Goodbye!");
    }
}
