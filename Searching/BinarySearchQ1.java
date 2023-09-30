package Searching;
import java.util.*;
public class BinarySearchQ1 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
	   int low =0;
	   int hig = arr.length -1;
	   int data =  0;
	   int floor = 0;
	   int ciel = 0;
	   while(low <= hig) {
		   int mid = (low + hig)/2;
		   
		   if( data > arr[mid]) {
			   low = mid +1;
			   floor = arr[mid];
		   }else if(data < arr[mid]) {
			   hig = mid -1;
			   ciel = arr[mid];
		   }else {
			   ciel = arr[mid];
			   floor =  arr[mid];
			   break;
		   }
	   }
	   
	   System.out.println(ciel);
	   System.out.println(floor);
	}
}
