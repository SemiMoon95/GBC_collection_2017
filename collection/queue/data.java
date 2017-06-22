package collection.queue;
import java.util.*;

 public class data<T>{
	private T value;
	private int priority;
	 
	public data(T value, int priority){
		 this.value=value;
		 this.priority=priority;
	}

	public void setValue(T value){
		this.value=value;
	}
	
	public T getValue(){
		return this.value;
	}

	public void setPriority(int priority){
		this.priority=priority;
	}

	public int getPriority(){return this.priority;}
		
	public String toString(){
		return "value: "+value+" priority: "+priority;
	}
 }
 
