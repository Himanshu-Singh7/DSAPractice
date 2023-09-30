package ArrayList;
import java.util.*;
public class Demo1 {
     public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list + " : " + list.size()); // find the size
		
		// Add the element
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list + " : " + list.size());
		
	   //Insert the element
		list.add(1 , 1000);
		System.out.println(list + " : " + list.size());
		//retive the data
		
		int val = list.get(2);
		System.out.println(val);
		// set the value
		list.set(1, 2000);
		System.out.println(list + " : " + list.size());
		//
		list.remove(3);
		System.out.println(list + " : " + list.size());
		
		ArrayList <String> list2 = new ArrayList<>();
		list2.add("Hello");
		list2.add("Mello");
		list2.add("Zello");
		
		System.out.println(list2 + ": " + list2.size());
		
//		for(int i = 0 ; i < list.size() ; i++) {
//		   int val1 =list.get(i);
//		   System.out.println(val1);
//		   
//		}
//		
		for(String val1 : list2) {
			System.out.println(val1);
		}
		
		System.out.println(list2);
		
    	 
	}
}
