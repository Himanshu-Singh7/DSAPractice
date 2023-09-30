package Recursion;
import java.util.*;
public class PrintZigzag {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	pzz(n);
  }
   
   public static void pzz(int n){
        if(n == 0) {
        	return;
        }
	   System.out.print("Pre :" + n);
	   pzz(n-1);
	   System.out.print("In :" + n);
	   pzz(n-1);
	   System.out.print("Post :" + n);
	   
	   
   }
}
