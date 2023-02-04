package assignment3;
import java.util.ArrayList;
public class q3 {
public static void main(String[] args) {
		
		//	Write a Java program to extract a portion of a array list.

		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		System.out.println(in.subList(1, 4));
		
	}

}


