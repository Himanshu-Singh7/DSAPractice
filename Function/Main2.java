package Function;

import java.util.*;
public class Main2 {
	
	public static void display(int n , int r ,int nPr) {
		System.out.println(n + "P" + r+ "=" + nPr);
	}
	
	public static int fact(int x) {
		int rv = 1;
		
		for(int i = x ; i >= 1 ; i--) {
			rv = rv * i;
		}
		return rv;
	   }
   
	    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		int nfact = fact(n);
		int nmrfact = fact(n-r);
		int nPr = nfact /nmrfact;
		display(n,r,nPr);
		
	}
}
