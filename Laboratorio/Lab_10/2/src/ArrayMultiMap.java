@SuppressWarnings("unchecked")
public class ArrayMultiMap<K, V> implements MultiMap<K, V> {

    private static final int INITIAL_SIZE = 5;

    private int size;
    private Pair<K, V>[] pairs = new Pair[INITIAL_SIZE];

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void makeEmpty() {
        pairs = new Pair[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void insert(K key, V value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException();
        }
        if (size >= pairs.length) {
            resize();
        }
        int index = search(key);
        if (index == -1) {
            pairs[size] = new Pair<K, V>(key, value);
            size++;
        } else {
            pairs[index].addValue(value);
        }
    }

    @Override
    public V remove(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        return pairs[search(key)].removeValue();
    }

    @Override
    public V find(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        return pairs[search(key)].values[0];
    }

    @Override
    public V[] findAll(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        return pairs[search(key)].values;
    }

    @Override
    public K[] keys() {
        K[] keys = (K[]) new Object[size];
        for (int i = 0; i < size; i++) {
            keys[i] = pairs[i].key;
        }
        return keys;
    }

    @Override
    public V[] removeAll(K key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        return pairs[search(key)].removeAll();
    }

    private void resize() {
        final Pair<K, V>[] newPairs = new Pair[size * 2];
        System.arraycopy(pairs, 0, newPairs, 0, size);
        pairs = newPairs;
    }

    private int search(K key) {
        for (int i = 0; i < size; i++) {
            if (pairs[i].key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    private class Pair<Y, Z> {

        private int size;

        private Y key;
        private Z[] values;

        Pair(Y key, Z[] values) {
            this.key = key;
            this.values = values;
        }

        Pair(Y key, Z value) {
            this(key, (Z[]) new Object[] { value });
        }

        private void addValue(Z value) {
            if (size >= values.length) {
                resize();
            }
            values[size] = value;
            size++;
        }

        private Z removeValue() {
            Z value = values[0];
            System.arraycopy(values, 1, values, 0, size);
            size--;
            return value;
        }

        private Z[] removeAll() {
            Z[] newArray = values;
            values = (Z[]) new Object[] {};
            size = 0;
            return newArray;
        }

        private void resize() {
            final Z[] newArray = (Z[]) new Object[size * 2];
            System.arraycopy(pairs, 0, newArray, 0, values.length);
            values = newArray;
        }

    }

}
