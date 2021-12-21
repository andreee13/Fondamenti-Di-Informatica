public interface Map<K, V> extends Container {
   V put(K key, V value);

   V get(K key);

   V remove(K key);

   K[] keys();
}
