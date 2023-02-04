package assignment3;
import java.util.LinkedList;
public class q7 {
public static void main(String[] args) {
		
		//	Write a Java program to display the elements and their positions in a linked list
		LinkedList<Integer> in = new LinkedList<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		in.add(60);
		in.add(70);
		for (int i =0 ; i < in.size(); i++) {
			System.out.println("Element " +in.get(i)+ " is at index " +i );
		}
	}
}
