package Arrays;
import java.util.*;
public class Main1 {
  public static void main(String[] args) {
	
	  int [] one = new int[3];
	  one[0] = 30;
	  one[1] = 20;
	  one[2] = 90;
	  
	  int [] two = one;
	  two[1] = 2000;
	  
	  for(int i = 0 ; i < two.length ; i++) {
		  System.out.println("One length of Array:"+two[i]);
	  }
	 
	  
	  
//	  for(int i = 0 ; i< two.length ; i++) {
//		  System.out.println("Two length of Array : "+two[i]);
//	  }
}
}
