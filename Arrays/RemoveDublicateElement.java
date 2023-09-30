package Arrays;
import java.util.*;
public class RemoveDublicateElement {
	
	public static void removeDublicateElement(int arr[],int n) {
		
		Arrays.sort(arr);                          //10,10,10
		int j = 0;
		
		for(int i = 0 ; i < n -1 ; i++) {
			if(arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
			
			
		}
		arr[j++] = arr[n - 1];
        for (int k = 0; k < j; k++) {
            System.out.print(arr[k]+" ");

        }
	}
	
	
	
     public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ;  i < n ; i++) {
			arr[i] = scn.nextInt();
		}
		
	  removeDublicateElement(arr,n);
		
		
	}
}
