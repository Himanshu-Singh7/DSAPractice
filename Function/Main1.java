package Function;

import java.util.*;
public class Main1 {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int r = sc.nextInt();
	   
	   int nfact = 1;
	   for(int i =n ; i >= 1 ; i--) {
		   nfact = nfact * i;
	   }
	   
	   int nmrfact = 1;
	   for(int i =n-r ; i >= 1 ; i--) {
		   nmrfact = nmrfact * i;
	   }
	   int nPr = nfact/nmrfact; 
	   
	   System.out.println(n + "P" + r+ "=" + nPr);
   }
   
  
   
   
}
