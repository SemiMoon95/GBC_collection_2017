import java.util.ArrayList;

public class newMap<K,V>{
	//private K key;
	//private V value;
	private ArrayList<K> keyArray=new ArrayList<>(); //keyArray : array of key
	private ArrayList<V> valArray=new ArrayList<>(); //valArray : array of value
	
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
	public boolean containsKey(K key){
		boolean temp;
		temp=keyArray.contains(key);
		return temp;
	}
	public boolean containsValue(V value){
		boolean temp;
		temp=valArray.contains(value);
		return temp;
	}
	public ArrayList<K> getKey(){
		return keyArray;
	}
	public ArrayList<V> getValue(){
		return valArray;
	}
	public void clear(){
		keyArray.clear();
		valArray.clear();
	}

}

