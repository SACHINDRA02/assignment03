package assignment3;
import java.util.ArrayList;
public class q4 {
public static void main(String[] args) {
		
		//	Write a Java program of swap two elements in an array list.
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		in.add(60);
		in.add(70);
		System.out.println(in);
		in.set(1, 60);
		in.set(5, 20);
		System.out.println(in);
	}



}
