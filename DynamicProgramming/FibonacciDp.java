package DynamicProgramming;
import java.util.*;
public class FibonacciDp {
     public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fibr = fibonaciMemoris(n, new int[n + 1]);
		System.out.println(fibr);
		
		
	}
     
     public static int fibonaci(int n) {
    	 
    	 if(n == 0 || n ==1) {
    		 return n;
    	 }
    	 
    	 
    	int fibn = fibonaci(n-1);
    	int fibm = fibonaci(n-2);
    	int fibre = fibn  + fibm;
    	return fibre;
    	 
     }
     
      public static int fibonaciMemoris(int n , int [] qb) {
    	 
    	 if(n == 0 || n ==1) {
    		 return n;
    	 }
    	 
    	 if(qb[n] != 0) {
    		return qb[n]; 
    	 }
    	 
    	System.out.println("Hello" + n); 
    	int fibn = fibonaciMemoris(n-1,qb);
    	int fibm = fibonaciMemoris(n-2,qb);
    	int fibre = fibn  + fibm;
    	qb[n] = fibre;
    	return fibre;
    	 
     }
     
     
    
}
