package Searching;
import java.util.*;
public class BinarySearchQ2 {
      public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     
	     int [] arr = new int[n];
	     for(int i = 0 ; i < arr.length ; i++) {
	    	 arr[i] = sc.nextInt();
	     }
	   // first index  
	     int data = sc.nextInt();
	     int low =  0 ;
	     int hig = arr.length -1;
	   
	     int fi = -1;
	     while(low <= hig) {
	    	 int mid = (low + hig)/ 2;
	    	 if( data > arr[mid]) {
	    		 low = mid + 1;
	    	 }else if(data < arr[mid]) {
	    		  hig = mid -1;
	    	 }else {
	    		 
	    		 fi = mid;
	    		 hig = mid -1;
	    		 
	    	 }
	     }
	    System.out.println(fi);
	   // Second index
	      low = 0;
	      hig = arr.length -1;
	      int last = -1;
	     while(low <= hig) {
	    	 int mid = (low + hig)/ 2;
	    	 if( data > arr[mid]) {
	    		 low = mid + 1;
	    	 }else if(data < arr[mid]) {
	    		  hig = mid -1;
	    	 }else {
	    		 
	    		 last = mid;
	    		 low = mid + 1;
	    		 
	    	 }
	     }
	    System.out.println(last);
	}
}
