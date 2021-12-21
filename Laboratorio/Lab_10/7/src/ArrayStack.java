@SuppressWarnings("unchecked")
public class ArrayStack<T> implements Stack<T> {

    private static final int INITIAL_SIZE = 5;

    private int size;
    private T[] items = (T[]) new Object[INITIAL_SIZE];

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items[size--];
    }

    @Override
    public void push(T item) {
        if (size >= items.length) {
            resize();
        }
        items[size] = item;
        size++;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items[size - 1];
    }

    @Override
    public void clear() {
        items = (T[]) new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(items[i].toString()).append(", ");
        }
        return stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "]").toString();
    }

    private void resize() {
        final T[] newArray = (T[]) new Object[size * 2];
        System.arraycopy(items, 0, newArray, 0, size);
        items = newArray;
    }

}

class EmptyStackException extends RuntimeException {

    public EmptyStackException() {
        super();
    }
}