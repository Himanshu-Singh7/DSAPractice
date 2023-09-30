package Function;
import java.util.*;
public class Demo3 {
	
	public static int multiplyNumbers(int a, int b) {
		
		return a *b;
		
	}
    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int a = scn.nextInt();
	int b = scn.nextInt();
	
	System.out.println(multiplyNumbers(a,b));
}
}
