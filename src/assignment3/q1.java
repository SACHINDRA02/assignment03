package assignment3;
import java.util.ArrayList;
public class q1 {
public static void main(String[] args) {
		
		// Write a Java program to search an element in a array list.
		
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(50);
		in.add(20);
		in.add(60);
		in.add(40);
		in.add(80);
		Integer n = 50;
		 for (int i = 0 ;i<in.size();i++) {
			 if ( n == in.get(i)) {
				 System.out.println("Element found at " + i + " index");
			 }
		 }
}
}