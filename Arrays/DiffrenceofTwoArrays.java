package Arrays;
import java.util.*;
public class DiffrenceofTwoArrays {
     public static void main(String[] args) {
    	 Scanner scn = new Scanner(System.in);
         
         // first arrays
         int n1 = scn.nextInt();
         int []a1 = new int[n1];
         
         for(int i = 0 ; i < a1.length ; i++) {
        	 a1[i] = scn.nextInt();
         }
         // Second arrays
         
         int n2 = scn.nextInt();
         int []a2 = new int[n2];
         
         for(int i = 0 ; i < a2.length ; i++) {
        	 a2[i] = scn.nextInt();
         }
         
         // arrays 3 rd
         int [] diff = new int [n2];
         int carry = 0;
         int i = a1.length -1;
         int j = a2.length -1;
         int k = diff.length - 1;
         
         while(k >= 0) {
        	 int dig = 0;
        	 int a1val = i >= 0? a1[i]: 0;
        	if(a2[j]+ carry >= a1[i]) {
        		dig = a2[j] + carry - a1val;
        		carry = 0;
        	}else {
        		dig = a2[j]+ carry +10 - a1val;
        		carry = -1;
        	}
        	
        	diff[k] = dig;
        	i--;
        	j--;
        	k--;
         }
         
         // print 
         
         int idx = 0;
         
         while(idx < diff.length) {
        	 if(diff[idx] == 0) {
        		 idx++;
        	 }else {
        		 break;
        	 }
         }
         
        while(idx < diff.length) {
        	System.out.println(diff[idx]);
        }
	}
}
