package StringLecture;

import java.util.*;
public class StringCompression {
	
	   public static String Compression1(String str) {
		   String s = str.charAt(0) + "";
		   
		   for(int i =1 ; i < str.length(); i++) {
			   char curr = str.charAt(i);
			   char perv = str.charAt(i -1);
			   if(curr != perv) {
				   s += curr;
			   }
		   }
		   
		   
		   return s;
		   
	   }
	   
	   public static String Compression2(String str) {
			
            String s = str.charAt(0) + "";
		    int count = 1;
		    for(int i =1 ; i < str.length(); i++) {
			   char curr = str.charAt(i);
			   char perv = str.charAt(i -1);
			   if(curr == perv) {
				   count++;
				  
			   }else {
				   if(count > 1) {
					   s +=count;
					   count =1;
				   }
				   
				   s +=curr;
			   }
		   }
		    
		    if(count > 1) {
				   s +=count;
				   count =1;
			   }
		   
		   
		   return s;
		   
	   }
	   
	
       public static void main(String[] args) {
		
    	   Scanner scn = new Scanner(System.in);
    	   String str = scn.nextLine();
    	   System.out.println(Compression1(str));
    	   System.out.println(Compression2(str));
    	   
    	   
	}
}
