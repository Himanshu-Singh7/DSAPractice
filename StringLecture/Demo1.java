package StringLecture;
import java.util.*;
public class Demo1 {
     public static void main(String[] args) {
		
    	 Scanner scn = new Scanner(System.in);
    	 String s1 = scn.nextLine();
    	//char ch = s1.charAt(2);
    	 
    	 System.out.println(s1);
    	 
    	 for(int i = 0 ; i < s1.length(); i++) {
    		 char ch = s1.charAt(i); 
    		 System.out.println(ch);
    	 }
    	 
	}
}
