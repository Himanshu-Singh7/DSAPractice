package Arrays;
import java.util.*;
public class SpanOfArray {
    public static void main(String[] args)  {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0;  i < arr.length ; i++) {
		
			 arr[i] = scn.nextInt();
		}
		
		int max = arr[0];
		int min = arr[1];
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
		  if(arr[i] < min) {
			  min = arr[i];
		  }
		}
		
		int span = max - min;
		System.out.println("Span of number:"+span);
    	
	}
}
