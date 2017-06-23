package collection.queue;

/** 
 	*2017_Summer GBC : priority queue
 	*@author : semi, harim
*/


import java.util.*;
<<<<<<< HEAD

public class newQueue<T extends Comparable<? super T>>{
	
	/** 
	2017_Summer GBC : priority queue
	@author: semi, harim
	*/
=======
public class newQueue<T extends Comparable<? super T>>{
>>>>>>> f624bb6ede360d25b1cda55b46a7397e0bbf13e4

	private ArrayList<T> queue; /** ArrayList queue: array of elements */

	public newQueue(){
		queue=new ArrayList<>();
	}
	
	/**
	 * Pop the top elements(1st priority element)
	 * @return T type elements
	 */
	public T pop(){
		T pn= queue.get(0);
		queue.remove(0);
		Collections.sort(queue);
		Collections.reverse(queue);
		return pn;
	}	
	
	/**
	 * show the 1st priority element
	 */
	public void peek(){System.out.println("peek: "+queue.get(0).toString());}

	/**
	 * Clear the priority queue. <pre>
	 * Remove all elements </pre>
	 */
	public void clear(){
		queue.clear();
		queue=new ArrayList<>();
	}
	
	/**
	 * if queue is empty, return true.
	 * @return boolean type(true or false)
	 */
	public boolean isEmpty(){
		return queue.size()==0;
	}
	
	/**
	 * Add an element to the priority queue. <br>
	 * And priority queue is sorted through 'Collection'. 
	 * @param value : T type, element
	 */
	public void add(T value){
		queue.add(value);
		Collections.sort(queue);
		Collections.reverse(queue);
	}	
	
	/**
	 * @return int type, priority queue size.
	 */
	public int size(){return queue.size();}
	
	/**
	 * Prints the all elements of priority queue.
	 */
	public void printPriority(){
		for(T data: queue){
			System.out.println(data.toString());
		}
	}
}






