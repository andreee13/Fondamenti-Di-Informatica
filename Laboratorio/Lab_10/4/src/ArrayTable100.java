@SuppressWarnings("unchecked")
public class ArrayTable100<T> implements Table<T> {

    private int size;
    private T[] items = (T[]) new Object[100];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void makeEmpty() {
        items = (T[]) new Object[100];
        size = 0;
    }

    @Override
    public void insert(int key, T value) {
        check(key);
        if (items[key] == null) {
            items[key] = value;
            size++;
        }
        items[key] = value;
    }

    @Override
    public void remove(int key) {
        check(key);
        if (items[key] != null) {
            items[key] = null;
            size--;
        }
    }

    @Override
    public T find(int key) {
        check(key);
        return items[key];
    }

    private void check(int key) {
        if (key < 0 || key >= items.length) {
            throw new InvalidPositionTableException();
        }
    }

}

class InvalidPositionTableException extends RuntimeException {
    
    public InvalidPositionTableException() {
        super();
    }
}