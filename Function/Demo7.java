package Function;

import java.util.*;
public class Demo7 {
	
	public static void printOddNumber(int n) {
		// loop
		int sum = 0;
		for(int i = 1 ; i <= n; i++) {
			if( i % 2 != 0) {
			    sum = sum + i ;
			   
			}
		}
		 System.out.println(sum);
		 return;
	}
   
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	printOddNumber(n);
}
}
