package assignment3;
import java.util.TreeSet;
public class q12 {
public static void main(String[] args) {
		
		/* Java program to get the element in a tree set which is strictly 
		greater than or equal to the given element */
		
		TreeSet<Integer> in = new TreeSet<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		in.add(60);
		in.add(70);
		Integer m = 40;
		in.forEach((k) -> {
			if (k >= m)
			System.out.println("Element "  + k);
			});

	}

}
