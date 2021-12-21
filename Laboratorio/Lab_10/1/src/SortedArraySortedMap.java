import java.util.Arrays;

@SuppressWarnings("unchecked")
public class SortedArraySortedMap<K, V> implements SortedMap<K, V> {

    private static final int INITIAL_SIZE = 5;

    private Pair<K, V>[] pairs = new Pair[INITIAL_SIZE];
    private int pairsSize;

    @Override
    public V put(K key, V value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException();
        }
        int index = binarySearch(pairs, 0, pairsSize - 1, key);
        System.out.println(index);
        if (index == -1) {
            if (pairsSize >= pairs.length) {
                resizePairs();
            }
            int i = pairsSize - 1;
            while (i >= 0 && ((Comparable<K>) pairs[i].key).compareTo(key) < 0) {
                pairs[i + 1] = pairs[i];
                i--;
            }
            pairs[i + 1] = new Pair<K, V>(key, value);
            pairsSize++;
            return null;
        }
        pairs[index].value = value;
        return value;
    }

    @Override
    public V get(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        int index = binarySearch(pairs, 0, pairsSize - 1, key);
        if (index == -1) {
            return null;
        }
        return pairs[index].value;
    }

    @Override
    public V remove(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        int index = binarySearch(pairs, 0, pairsSize - 1, key);
        if (index == -1) {
            return null;
        }
        Pair<K, V> pair = pairs[index];
        for (int i = index; i < pairs.length; i++) {
            pairs[i] = pairs[i + 1];
        }
        pairsSize--;
        return pair.value;
    }

    @Override
    public K[] keys() {
        return sortedKeys();
    }

    @Override
    public boolean isEmpty() {
        return pairsSize == 0;
    }

    @Override
    public void makeEmpty() {
        pairs = new Pair[INITIAL_SIZE];
        pairsSize = 0;
    }

    @Override
    public K[] sortedKeys() {
        K[] keys = (K[]) new Object[pairsSize];
        for (int i = 0; i < pairsSize; i++) {
            keys[i] = pairs[i].key;
        }
        return keys;
    }

    public int size() {
        return pairsSize;
    }

    private void resizePairs() {
        final Pair<K, V>[] newPairs = new Pair[pairsSize * 2];
        System.arraycopy(pairs, 0, newPairs, 0, pairsSize);
        pairs = newPairs;
    }

    private int binarySearch(Pair<K, V>[] pairs, int left, int right, K key) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            int comparison = ((Comparable<K>) pairs[mid].key).compareTo(key);
            if (comparison == 0) {
                return mid;
            } else if (comparison > 0) {
                return binarySearch(pairs, left, mid - 1, key);
            } else {
                return binarySearch(pairs, mid + 1, right, key);
            }
        }
        return -1;
    }

    private class Pair<Y, Z> {

        private Y key;
        private Z value;

        Pair(Y key, Z value) {
            this.key = key;
            this.value = value;
        }

    }

}
