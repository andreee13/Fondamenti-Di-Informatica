import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        System.out.println("Enter a number: ");
        array[0] = scanner.nextInt();
        System.out.println("Enter a second number: ");
        array[1] = scanner.nextInt();
        System.out.println("Enter a third number: ");
        array[2] = scanner.nextInt();
        Arrays.sort(array);
        scanner.close();
        StringBuilder sb = new StringBuilder();
        if (array[0] + array[1] > array[2] && array[0] + array[2] > array[1] && array[1] + array[2] > array[0]) {
            sb.append("Triangolo ");
            if (array[0] == array[1] && array[1] == array[2]) {
                sb.append("equilatero ");
            } else if (array[0] == array[1] || array[1] == array[2] || array[0] == array[2]) {
                sb.append("isoscele ");
            } else {
                sb.append("scaleno ");
            }
            int a = array[2] * array[2] - array[0] * array[0] - array[1] * array[1];
            if (a > 0) {
                sb.append("ottusangolo");
            } else if (a == 0) {
                sb.append("rettangolo");
            } else {
                sb.append("acutangolo");
            }
        } else {
            sb.append("Non è un triangolo");
        }
        System.out.println(sb.toString());
    }
}
