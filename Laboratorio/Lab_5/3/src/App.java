import java.util.Arrays;

public class App {

    static int[] resize(int[] arr, int newSize) {
        int[] newArr = new int[newSize];
        for (int i = 0; i < (newSize > arr.length ? arr.length : newSize); i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    static double[] resize(double[] arr, int newSize) {
        double[] newArr = new double[newSize];
        for (int i = 0; i < (newSize > arr.length ? arr.length : newSize); i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(resize(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 15)));
        System.out.println(
                Arrays.toString(resize(new double[] { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0 }, 15)));

    }
}
