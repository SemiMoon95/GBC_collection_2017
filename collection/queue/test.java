package collection.queue;

import collection.queue;

public class Test {
	public static void main(String[] args){
		newQueue newq=new newQueue();
		newq.add(1);
		newq.add(2);
		newq.add(13);
		newq.printPriority();
		newq.pop();
		newq.printPriority();
		newq.clear();
		System.out.println("------------");
		newq.add(2);
		newq.printPriority();
	}

}

