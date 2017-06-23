import java.util.Scanner;
import java.util.ArrayList;

/**
 *Main class for newMap
 *@author : harim,semi
 */

public class mapMain{
	public static void main(String[] args){
		int key,input,subinput;
		String value;
		boolean i;
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		newMap<Integer,String> map = new newMap<>();
		ArrayList list = new ArrayList();

		do{
			System.out.println("Choose the number");
			System.out.println("1)put");
			System.out.println("2)get");
			System.out.println("3)search");
			System.out.println("4)get all data");
			System.out.println("5)clear all data");
			System.out.println("6)Exit");
			System.out.print("                               INPUT : ");
			input = scan.nextInt();
	                System.out.println("======================================================================");
			
			if(input<1||input>6){
				System.out.println("<Warning>please input the number in the range");
				System.out.println("======================================================================");
				input = 7;
			}

			switch(input){
				case 1:System.out.print("key:");
				       key=scan.nextInt();
				       System.out.print("value:");
				       value=scan1.nextLine();
				       System.out.println("======================================================================");
				       map.put(key,value);
				       System.out.println("Complete"); 
				       System.out.println("======================================================================");
				       break;
				case 2:System.out.print("key:");
				       key=scan.nextInt();
				       System.out.println("======================================================================");
				       value=map.get(key);
				       System.out.println("Value :" + value);
				       System.out.println("======================================================================");
				       break;
				case 3:System.out.println("What data you want to search? 1)key 2)value");
				       subinput=scan.nextInt();
				       System.out.println("======================================================================");
				       if(subinput==1){
				       		System.out.print("key:");
						key=scan.nextInt();
				                System.out.println("======================================================================");
						i=map.containsKey(key);
				       }
				       else{
					       System.out.print("value:");
					       value=scan1.nextLine();
				               System.out.println("======================================================================");
					       i=map.containsValue(value);
				       }
				       System.out.println("result:"+i);
				       System.out.println("======================================================================");
				       break;
				case 4:System.out.println("What data you want to get? 1)key 2)value");
				       subinput=scan.nextInt();
				       System.out.println("======================================================================");
				       if(subinput==1){
				       		list=map.getKey();
				       		System.out.print("result : ");
						for(int count=0;count<list.size();count++)
							System.out.print(list.get(count)+" ");
						System.out.println();
				                System.out.println("======================================================================");
				       }
				       else{
				       		list=map.getValue();
						System.out.print("result : ");
						for(int count=0;count<list.size();count++)
							System.out.print(list.get(count)+" ");
						System.out.println();
				                System.out.println("======================================================================");
				       }
				       break;
				case 5:map.clear();
				       System.out.println("Complete");
				       System.out.println("======================================================================");
				       break;
				case 6:break;
				default:break;
			}
		}while(input!=6);
		System.out.println("Exit program");
	}
}
