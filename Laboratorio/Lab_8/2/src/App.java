import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    private static void swap(int[] a, int i, int j) {
        int temp = a[i]; // non verifico precondizioni
        a[i] = a[j]; // perché è un metodo privato
        a[j] = temp;
    }

    private static int findMinPosFrom(int[] a, int from) {
        int pos = from;
        for (int i = pos + 1; i < a.length; i++)
            if (a[i] < a[pos])
                pos = i;

        return pos;
    } // è diverso da quello che avevamo progettato...
      // cerca da una certa posizione in poi

    public static void selectionSort(int[] a) {
        if (a == null) // è un metodo “void”
            return; // non serve lanciare un’eccezione

        for (int i = 0; i < a.length - 1; i++) // tranne l’ultimo
        {
            int minPos = findMinPosFrom(a, i); // cerco l’elemento

            if (minPos != i) // che deve andare in posizione i
                swap(a, minPos, i);
        } // ok anche nei casi degeneri, a.length 0 e 1,
    } // nei quali non c’è niente da fare... e non fa niente!

    private static void merge(int[] a, int[] b, int[] c) {
        int ia = 0, ib = 0, ic = 0; //
        while (ib < b.length && ic < c.length)
            if (b[ib] < c[ic]) // per “cancellare” un
                a[ia++] = b[ib++]; // elemento da b o c
            else // incremento il
                a[ia++] = c[ic++]; // relativo indice
        // attenzione ai due cicli che seguono...
        while (ib < b.length)
            a[ia++] = b[ib++];
        while (ic < c.length)
            a[ia++] = c[ic++];
    }

    public static void mergeSort(int[] a) {
        if (a == null)
            return; // è void...
        if (a.length < 2)
            return; // caso base
        // divido circa a metà
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
        System.arraycopy(a, 0, left, 0, left.length);
        System.arraycopy(a, mid, right, 0, right.length);
        // passi ricorsivi per due problemi più semplici, si
        // tratta di ricorsione multipla (doppia)
        mergeSort(left);
        mergeSort(right);
        // fusione (metodo ausiliario)
        merge(a, left, right);
    }

    public static void insertionSort(int[] a) { // il ciclo inizia da 1 perché il primo
                                                // elemento non richiede attenzione
        for (int i = 1; i < a.length; i++) { // sposto a[i] verso sinistra finché serve:
                                             // il primo elemento con cui confrontarlo è
                                             // a[i-1], quindi parto con j = i-1
            for (int j = i - 1; j >= 0; j--)
                if (a[j] > a[j + 1])
                    // devo spostare a[j+1] verso sinistra
                    swap(a, j, j + 1); //
                else // non devo più spostare
                    break; // è arrivato nel posto giusto
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int[] array = new int[scanner.nextInt()];
        scanner.close();
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(99);
        }
        if (array.length < 21) {
            System.out.println(Arrays.toString(array));
        }
        int[] originalArray = new int[array.length];
        System.arraycopy(array, 0, originalArray, 0, array.length);
        long startingMillis = System.currentTimeMillis();
        selectionSort(array);
        long selectionSortMillis = System.currentTimeMillis() - startingMillis;
        if (array.length < 21) {
            System.out.println(Arrays.toString(array));
        }
        System.arraycopy(originalArray, 0, array, 0, array.length);
        startingMillis = System.currentTimeMillis();
        mergeSort(array);
        long mergeSortMillis = System.currentTimeMillis() - startingMillis;
        if (array.length < 21) {
            System.out.println(Arrays.toString(array));
        }
        System.arraycopy(originalArray, 0, array, 0, array.length);
        startingMillis = System.currentTimeMillis();
        insertionSort(array);
        long insertionSortMillis = System.currentTimeMillis() - startingMillis;
        if (array.length < 21) {
            System.out.println(Arrays.toString(array));
        }
        System.out.printf("Selection Sort: %dms\nMerge Sort: %dms\nInsertion sort: %dms\n", selectionSortMillis,
                mergeSortMillis, insertionSortMillis);
    }
}
