public interface MultiMap<K, V> extends Container {
    /**
     * Inserisce nel dizionario un’associazione avente
     * chiave uguale a key e valore uguale a value.
     * 
     * @param key   la chiave specificata
     * @param value il valore specificato
     * @throws IllegalArgumentException se key o value sono null
     */
    void insert(K key,  V value);

    /**
     * Elimina dal dizionario un’associazione di chiave specificata
     * restituendone il valore associato oppure null se non e’
     * presente nel dizionario.
     * 
     * @param key la chiave specificata
     * @return un valore associato alla chiave specificata,
     *         se presente, null altrimenti
     */
    V remove(K key);

    /**
     * Se il dizionario contiene un’associazione avente
     * chiave uguale a key, restituisce true,
     * altrimenti restituisce false
     * 
     * @param key la chiave specificata
     * @return uno dei valori associati se la chiave specificata e’
     *         presente, altrimenti null
     */
    V find(K key);

    /**
     * Se il dizionario contiene una o più associazioni aventi chiave
     * uguale a key, restituisce i valori, altrimenti restituisce un
     * array vuoto
     * 
     * @param key la chiave specificata
     * @return un array con i valori associati alla chiave specificata,
     *         se presente, o un array vuoto se non presente
     */
    V[] findAll(K key);

    /**
     * @return un array contenente le chiavi del
     *         dizionario, eventualmente ripetute. Restituisce un
     *         array vuoto (0 elementi) se il dizionario e’ vuoto
     */
    K[] keys();

    /**
     * Se ci sono associazioni di chiave uguale a key, ne
     * restituisce i valori, altrimenti restituisce un
     * array vuoto.
     * 
     * @param key la chiave specificata
     * @return valori associati alla chiave specificata,
     *         se presente, o un array vuoto altrimenti
     */
    V[] removeAll(K key);

}