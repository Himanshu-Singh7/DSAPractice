package Arrays;
import java.util.*;
public class MinMax {
      public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int  i = 0 ; i < arr.length ; i++) {
			arr[i] = scn.nextInt();
		}
	    findMinMax(arr);
		
		
	}
      
      public  static void findMinMax(int arr[]) {
    	 int min = arr[0];
    	 int max =  arr[0];
    	 
    	 for(int i =1  ; i < arr.length ; i++) {
    		 if(arr[i] < min) {
    			 min = arr[i];
    		 }else if(arr[i] > max) {
    			 max = arr[i];
    		 }
    	 }
    	 System.out.println(min);
    	 System.out.println(max);
      }
}
