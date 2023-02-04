package assignment3;
import java.util.Iterator;
import java.util.LinkedList;

public class q5 {
public static void main(String[] args) {
		
		// Write a Java program to iterate through all
		// elements in a linked list starting at the specified position

		LinkedList<Integer> in = new LinkedList<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		in.add(60);
		in.add(70);
		
	    Iterator p = in.listIterator(2);
	    while(p.hasNext()) {
	    	System.out.println(p.next());
	    }
	}


}
