import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number of elements: ");
        int n = scanner.nextInt();
        float[] array1 = new float[n];
        float[] array2 = new float[n];
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Insert element #%d of array 1: ", i + 1);
            array1[i] = scanner.nextFloat();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("Insert element #%d of array 2: ", i + 1);
            array2[i] = scanner.nextFloat();
        }
        float sum = 0.0f;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i] + array2[i];
            System.out.printf("Element #%d of array 1 + element #%d of array 2 = %f\n", i + 1, i + 1,
                    array1[i] + array2[i]);
        }
        System.out.println("Sum of all elements = " + sum);
        scanner.close();
    }
}
