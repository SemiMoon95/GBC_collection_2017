import java.util.ArrayList;

/** 
 *2017_Summer GBC Assignment : Map
 *@author : semi,harim
 */ 

public class newMap<K,V>{
	
	private ArrayList<K> keyArray=new ArrayList<>(); /**keyArray : array of key*/
	private ArrayList<V> valArray=new ArrayList<>(); /**valArray : array of value*/
	
	/**
	 *put the value and key in pair in the map
	 *@param key - the key data to put in the map
	 *@param value - the value data to put in the map
	 */
	public void put(K key, V value){
		int keyIndex;
		if(keyArray.contains(key)){
			keyIndex=keyArray.indexOf(key);
			valArray.set(keyIndex,value);
		}
		else{
			keyArray.add(key);
			valArray.add(value);	
		}
	}
	
	/**
	 *get the value that make a pair with the key from the map
	 *@param key - the key data to find a value
	 *@return the value matched up with the key
	 */
	public V get(K key){
		int keyIndex;
		V value;

		if(keyArray.contains(key)){
			keyIndex=keyArray.indexOf(key);
			value=valArray.get(keyIndex);
			return value;
		}
		else
			return null;
	} 

	/**
	 *check that the key data is or not 
	 *@param key - the key data to check
	 *@return true or false
	 */
	public boolean containsKey(K key){
		boolean temp;
		temp=keyArray.contains(key);
		return temp;
	}

	/**
	 *check that the value is or not
	 *@param value - the value to check
	 *@return true or false
	 */
	public boolean containsValue(V value){
		boolean temp;
		temp=valArray.contains(value);
		return temp;
	}

	/**
	 *return all key datas
	 *@return ArrayList that have the key datas
	 */
	public ArrayList<K> getKey(){
		return keyArray;
	}

	/**
	 *return all values
	 *@return ArrayList that have the values
	 */
	public ArrayList<V> getValue(){
		return valArray;
	}

	/**
	 *delete all the data in the map
	 */
	public void clear(){
		keyArray.clear();
		valArray.clear();
	}

}

