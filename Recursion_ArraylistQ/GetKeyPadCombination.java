package Recursion_ArraylistQ;
import java.util.*;
public class GetKeyPadCombination {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> words = getKPC(str);
		System.out.println(words);
	}
     
     static String[] charmap = {".;","abc","def","ghi"," jkl","mno","pqrs","tu","vwx","yz"};
     
     public static ArrayList<String> getKPC(String str){
    	 
    	 if(str.length() == 0) {
  		   ArrayList<String> bcaseResult = new ArrayList<>();
  		   bcaseResult.add("");
  		   return bcaseResult;
  	   }    	 
    	// 678
		char ch = str.charAt(0); //  6
		String ros = str.substring(1); // 78
		
		ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();
		
		String codeforch = charmap[ch - '0'];
		for(int i = 0 ; i < codeforch.length() ; i++) {
			char chcharmap = codeforch.charAt(i);
			for(String rstr : rres) {
				mres.add(chcharmap + rstr);
			}
		}
		
		
		
    	 
    	 return mres;
    	 
     }
}
