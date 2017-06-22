package collection.queue;
import java.util.*;
import collection.queue.data;
public class newQueue{
	/** 
	
	* 2017_Summer GBC_priority queue
	* made by semi, harim
	--------Man Heap Priority Queue-----------
	*/

	private data[] heap;
	private int heapsize;

	public newQueue(){
		heap=new data[255];
		heapsize=0;
	}

	public data pop(){
		int parent, child;
		data item, temp;
		if(isEmpty()){
			System.out.println("queue is empty");
			return null;
		}
		
		item=heap[1];
		System.out.println("pop: "+item.toString());
		temp=heap[heapsize--];

		parent=1;
		child=2;
		while(child<=heapsize){
			if(child<heapsize&&
			heap[child].getPriority()<heap[child+1].getPriority()) child++;
			if(temp.getPriority()>=heap[child].getPriority())
				break;

			heap[parent]=heap[child];
			parent=child;
			child*=2;
		}

		heap[parent]=temp;
		return item;
	}
	
	
	public void peek(){System.out.println("peek: "+heap[1].toString());}

	public void clear(){
		heap=new data[255];
		heapsize=0;
	}

	public boolean isEmpty(){
		return heapsize==0;
	}

	public <T> void add(T value, int priority){
		data newData= new data(value, priority);
		heap[++heapsize]=newData;
		int pos = heapsize;
		while(pos!=1&&
			newData.getPriority() > heap[pos/2].getPriority()){
			heap[pos]=heap[pos/2];
			pos/=2;
		}
		heap[pos]=newData;
	}

	public int size(){return heapsize;}
	
	public void printPriority(){
		for(int i=1; i<heapsize+1; i++){
			System.out.println(heap[i].toString());
		}
	}
}






