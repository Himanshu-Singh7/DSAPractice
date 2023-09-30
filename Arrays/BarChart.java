package Arrays;
import java.util.*;
public class BarChart {
     public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = scn.nextInt();
		
		// find the length 
		int [] arr = new int [n];
		for(int i = 0 ; i < arr.length ; i++) {
			 arr[i] = scn.nextInt();
		}
		
		// Find out the maximum array
		int max = arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
	// find the maximum floor
		for(int floor = max ; floor >=1 ; floor--) {
			//we will go all floor
			for(int i = 0 ;  i < arr.length ; i++) {
				if(arr[i] >= floor) {
					System.out.print("*/t");
				}else {
					System.out.print("/t ");
				}
			}
		}
		
		System.out.println();
		
    	 
	}
}
