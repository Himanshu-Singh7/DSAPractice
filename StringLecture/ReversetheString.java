package StringLecture;
import java.util.*;
public class ReversetheString {
	
	public static String reverseString(String str) {
		String rv ="";
		
		int i =0;
		int len = str.length();
		for(i = len ; i > 0; i--) {
			
			rv = rv + str.charAt(i -1); 
		}
		
		return  rv;
		
	}
     public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    String str =  scn.nextLine();
		System.out.println(reverseString(str));
	    
	    
		
		
		
		
	}
}
