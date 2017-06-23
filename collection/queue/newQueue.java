package collection.queue;
import java.util.*;

public class newQueue<T extends Comparable<? super T>>{
	
	/** 
	2017_Summer GBC : priority queue
	@author: semi, harim
	*/

	private ArrayList<T> queue;
	private int heapsize;

	public newQueue(){
		queue=new ArrayList<>();
	}

	public T pop(){
		T pn= queue.get(0);
		queue.remove(0);
		Collections.sort(queue);
		Collections.reverse(queue);
		return pn;
	}	
	
	public void peek(){System.out.println("peek: "+queue.get(0).toString());}

	public void clear(){
		queue.clear();
		queue=new ArrayList<>();
	}

	public boolean isEmpty(){
		return queue.size()==0;
	}

	public void add(T value){
		queue.add(value);
		Collections.sort(queue);
		Collections.reverse(queue);
	}	
	
	public int size(){return queue.size();}
	
	public void printPriority(){
		for(T data: queue){
			System.out.println(data.toString());
		}
	}
}






