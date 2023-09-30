package Function;
import java.util.*;
public class Demo5 {
	
	
	public static void printFactorial(int n) {
		 
	  //For negative number
		if(n < 0) {
			System.out.println("Invalid number");
			return;
		}
		
		//loop
		int factorial = 1;
		for(int i = n ; i >=1 ; i--) {
			factorial =  factorial * i;
			
		}
		System.out.println(factorial);
		return;
	   }
   
	    public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = scn.nextInt();
		printFactorial(n);
	}
}
