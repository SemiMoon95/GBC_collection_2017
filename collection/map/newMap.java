public class newMap{
	private <T> key;
	private <T> value;
	private ArrayList<T> arr_k;
	private ArrayList<T> arr_v;
	
	public void put(T key, T value){}
	public <T> get(T key){return value;} 
	public boolean constainsKey(T key){return true;}
	public boolean constainsValue(T value){return true;}
	public ArrayList<T> getKey(){return arr_k;}
	public ArrayList<T> getValue(){return arr_v;}
	public void clear(){}

}

