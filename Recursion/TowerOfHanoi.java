package Recursion;
import java.util.*;
public class TowerOfHanoi {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Tow1 = sc.nextInt();
		int Tow2 = sc.nextInt();
		int Tow3 = sc.nextInt();
		toh(n,Tow1,Tow2,Tow3);
		
	}
	
    public static void toh(int n, int t1id, int t2id, int t3id){
    	if(n == 0) {
    		return;
    	}
    	toh(n-1 , t1id,t3id,t2id);
    	System.out.println(n+"["+ t1id + " -> " + t2id + "]");
    	toh(n-1 ,t3id ,t2id,t1id );
    	
    }

}
