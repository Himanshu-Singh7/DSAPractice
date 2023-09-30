package Searching;

// Binary search
public class BinarySearch {
    public static void main(String[] args) {
		
    	int [] arr = {10,20,30,40,50,60,70,80,90,100};
    	int data = 70;
    	
    	int low = 0;
    	int hig = arr.length -1;
    	
    	while(low <= hig) {
    		int mid = (low + hig)/2;
    		
    		if(data > arr[mid]) {
    			low = mid + 1;
    		}else if(data < arr[mid]) {
    			hig = mid - 1;
    		}else {
    			System.out.println("Binary search element is found: "+ mid);
    			return;
    		}
    		
    	}
    	
    	System.out.println("Element is not found:" + -1);
	}
}
