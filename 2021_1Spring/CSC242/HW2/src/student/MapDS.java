package student;

import java.util.Map;

public class MapDS <K, V> {
	/**
	 * Removes all of the mappings from this map.
	 */
	public void clear(){

	}

	/**
	 * Returns true if this map contains a mapping for the specified key.
	 * @param key
	 * @return
	 */
	public boolean containsKey(K key){
		return this.containsKey(key);
	}

	/**
	 * Returns true if this map maps one or more keys to the specified value.
	 * @param value
	 * @return
	 */
	public boolean	containsValue(V value){
		return this.containsValue(value);
	}

	/**
	 * Returns the value to which the specified key is mapped, or null if this
	 * map contains no mapping for the key.
	 * @param key
	 * @return
	 */
	public V get(Object key){
		return this.get(key);
	}

	/**
	 * Returns true if this map contains no key-value mappings.
	 * @return
	 */
	public boolean isEmpty(){
		return this.isEmpty();
	}

	/**
	 * Associates the specified value with the specified key in this map.
	 * @param key
	 * @param value
	 */
	public void put(K key, V value){

	}

	/**
	 * Copies all of the mappings from the specified map to this map.
	 * @param m
	 */
	public void putAll(Map<? extends K,? extends V> m){

	}

	/**
	 * Removes the mapping for a key from this map if it is present.
	 * @param key
	 * @return
	 */
	public void remove(Object key){

	}

	/**
	 * Removes the entry for the specified key only if it is currently mapped to the 
	 * specified value.
	 * @param key
	 * @param value
	 * @return
	 */
	public void remove(Object key, Object value){

	}

	/**
	 * Replaces the entry for the specified key only if it is currently mapped to some value.
	 * @param key
	 * @param value
	 * @return
	 */
	public void replace(K key, V value){

	}
	
	/**
	 * Replaces the entry for the specified key only if currently mapped to the 
	 * @param key
	 * @param oldValue
	 * @param newValue
	 * @return
	 */
	public void replace(K key, V oldValue, V newValue){

	}
	
	/**
	 * Returns the number of key-value mappings in this map.
	 * @return
	 */
	public int	size(){
		return this.size();
	}

}