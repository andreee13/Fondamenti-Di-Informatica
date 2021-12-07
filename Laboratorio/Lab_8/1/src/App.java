import java.util.Arrays;

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

    public static void mergesort(int[] a) {
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
        mergesort(left);
        mergesort(right);
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
        int[] array = { 3, 6, 0, 23, 18, 9 };
        // selectionSort(array);
        // mergesort(array);
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
