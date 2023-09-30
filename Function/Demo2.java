package Function;
import java.util.*;
public class Demo2 {
	
	public static int SumTwoNumber(int num1 , int num2) {
		int sum = num1+ num2;
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = scn.nextInt();
		System.out.println("Enter the second number");
		int num2 = scn.nextInt();
		int sum = SumTwoNumber(num1,num2);
		System.out.println("Sum of two number :"+ sum);
		

	}

}
