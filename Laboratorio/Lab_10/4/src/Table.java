public interface Table<T> extends Container {
    void insert(int key, T value);

    void remove(int key);

    T find(int key);
}