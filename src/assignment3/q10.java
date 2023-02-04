package assignment3;
import java.util.TreeSet;
public class q10 {
public static void main(String[] args) {
		
		//	Write a Java program to iterate through all elements in a tree set.

		TreeSet<Integer> in = new TreeSet<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		in.add(60);
		in.add(70);
		in.forEach((k) -> {
			System.out.println("Element "  + k);
			});
	}

}
