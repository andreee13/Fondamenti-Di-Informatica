import java.util.Random;

public class App {

    public static int[] randomIntArray(int length, int n) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(n);
        }
        return array;
    }

    public static String printArray(int[] v) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i : v) {
            stringBuilder.append(i + ", ");
        }
        return stringBuilder.append(']').toString().replace(", ]", "]");
    }

    public static void remove(int[] v, int index) {
        System.arraycopy(v, index + 1, v, index, v.length - index - 1);
        v[v.length - 1] = 0;
    }

    public static void removeSorted(int[] v, int index) {
        // TODO
    }

    public static void insert(int[] v, int index, int value) {
        System.arraycopy(v, index, v, index + 1, v.length - index - 1);
        v[index] = value;
    }

    public static int findMin(int[] v) {
        int min = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
            }
        }
        return min;
    }

    public static int findMax(int[] v) {
        int max = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        return max;
    }

    public static int find(int[] v, int target) throws Exception {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == target) {
                return i;
            }
        }
        throw new Exception("Cannot find specified item");
    }

    public static void main(String[] args) throws Exception {
        int[] array = randomIntArray(10, 10);
        System.out.println(printArray(array));
        remove(array, 4);
        System.out.println(printArray(array));
        insert(array, 6, 10);
        System.out.println(printArray(array));
        System.out.printf("Element %d is at position %d\n", array[array.length / 2],
                find(array, array[array.length / 2]));
        System.out.printf("Max: %d\n", findMax(array));
        System.out.printf("Min: %d\n", findMin(array));
    }
}
