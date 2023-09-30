package Searching;
import java.util.*;

// linear Search Algoritham
public class LinearSearch {
    public static void main(String[] args) {
    	
    	//Take how many numbers
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	   // Declare the arrays
		int arr[] = new int [n];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		// Logic
		int value = sc.nextInt();
		for(int i = 0 ; i < arr.length ; i ++) {
			
			if(arr[i] == value) {
				System.out.println(" of Linear Element :" + arr[i]);
			}
		}
		
		System.out.println("Element is Not found :"+ -1);
	
	}
}
