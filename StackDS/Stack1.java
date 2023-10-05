package StackDS;
import java.util.*;
public class Stack1 {
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		System.out.println(st +"->"+ st.peek() + " " +st.size());
		st.push(20);
		System.out.println(st +"->"+ st.peek() + " " +st.size());
		st.push(30);
		System.out.println(st +"->"+ st.peek() + " " +st.size());
		st.push(40);
		System.out.println(st +"->"+ st.peek() + " " +st.size());
		// remove element
		st.pop();
		System.out.println(st +"->"+ st.peek() + " " +st.size());  // 30 --> Top element , size is 3
		st.pop();
		System.out.println(st +"->"+ st.peek() + " " +st.size());  // 20 --> Top element ,size is 2
		st.pop();
		System.out.println(st +"->"+ st.peek() + " " +st.size()); // 10 ---> Top elemnt ,size is 1
		st.pop();
		System.out.println(st +"->" + " " +st.size());
	}

}
