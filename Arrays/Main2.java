package Arrays;
import java.util.*;
import java.io.*;
public class Main2 {
	
	public static void swap(int arr[] , int i , int j ) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
   public static void main(String[] args) {
	    
	   int [] arr = new int[5];
	   arr[0] = 10;
	   arr[1] = 20;
	   arr[2] = 30;
	   arr[3] = 40;
	   arr[4] = 50;
	   
	  swap(arr,0 , 4); 
	  
	  for(int i = 0 ; i < arr.length ; i++) {
		  System.out.println(arr[i]);
	  }
	   
}
}
