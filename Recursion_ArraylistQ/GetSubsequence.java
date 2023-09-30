package Recursion_ArraylistQ;
import java.util.*;
public class GetSubsequence {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	ArrayList<String> res = getSubSequence(str);
	System.out.println(res);
	
	
  }
   
   public static ArrayList<String> getSubSequence(String str){
	   // Base Case
	   if(str.length() == 0) {
		   ArrayList<String> bcaseResult = new ArrayList<>();
		   bcaseResult.add("");
		   return bcaseResult;
	   }
	   
	   char ch = str.charAt(0);         // a     Line No 1
	   String ros = str.substring(1);     // b   Line no 22
	   
	   ArrayList<String> rres = getSubSequence(ros);  // abc
	   
	   ArrayList<String> myres = new ArrayList<>();  // new ArrayList
	   
	   for(String sres : rres ) {
		   myres.add("" + sres);
	   }
	   
	   for(String sres : rres ) {
		   myres.add(ch + sres);
	   }
	   
	 
	   return myres;
	   
   }
}

// Output = [, c, b, bc, a, ac, ab, abc]
