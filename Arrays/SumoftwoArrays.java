package Arrays;
import java.util.*;

public class SumoftwoArrays {
     public static void main(String[] args)  {
		Scanner scn = new Scanner(System.in);
	    //First Number
		int n1 = scn.nextInt();
		int []a1 = new int[n1];
		for(int i = 0 ; i < a1.length ; i++) {
			a1[i] = scn.nextInt();
		}
		
		//Second Number
		int n2 = scn.nextInt();
		int []a2 = new int[n2];
		for(int i = 0 ; i < a2.length ; i++) {
			a2[i] = scn.nextInt();
		}
		
		// Make sum
		
		int [] sum = new int[n1 > n2 ? n1: n2];
		// Make carry
		int carry = 0;
		
		int i = a1.length - 1;
		int j = a2.length - 1; 
		int k = sum.length- 1;
		
		while(k >= 0) {
			int digt = carry;
			if(i >= 0) {
				digt += a1[i];
			}
			if(j >= 0) {
				digt += a2[j];
			}
			
		 carry = digt/10;
		 digt = digt %10;
		 
		 sum[k] = digt;
		 i--;
		 j--;
		 k--;
			
		}
		
		if(carry != 0) {
			System.out.println(carry);
		}
		
		for(int val : sum) {
			System.out.println(val);
		}
		
	}
}

