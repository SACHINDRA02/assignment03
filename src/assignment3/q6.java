package assignment3;

import java.util.LinkedList;
public class q6 {

	public static void main(String[] args) {
		
		//	Write a Java program to insert some elements at the specified position into a linked list

		LinkedList<Integer> in = new LinkedList<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		in.add(60);
		in.add(70);
		in.add(2, 90);
		in.add(1, 80);
		System.out.println(in);
	}

}
