package Function;
//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class Demo6 {
   public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);

	int a = scn.nextInt();
	int b = scn.nextInt();
	int c = scn.nextInt();
	
	int avg = (a+b+c)/4;
	
	System.out.println(avg);
}
}
