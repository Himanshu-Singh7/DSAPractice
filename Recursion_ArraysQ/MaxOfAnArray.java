package Recursion_ArraysQ;
import java.util.*;
public class MaxOfAnArray {
     public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int []arr = new int[n];
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = scn.nextInt();
		}
		
	  int max = maxOfanArray(arr,0);
	  System.out.println(max);
	}
     
     public static int maxOfanArray(int[] arr , int idx) {
    	 
    	 //Base case
    	 if(idx == arr.length -1) {
    		 return arr[idx];
    	 }
		
    	 int misa = maxOfanArray(arr , idx +1);
    	 if(misa > arr[idx]) {
    		 return misa;
    	 }else {
    		 return arr[idx];
    	 }
    	 
    	 
     }
}
