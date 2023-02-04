package assignment3;
import java.util.TreeSet;
public class q11 {
public static void main(String[] args) {
		
		//Java program to add all the elements of a specified tree set to another tree set

		TreeSet<String> in = new TreeSet <String>();
		TreeSet<String> im = new TreeSet <String>();
		in.add("Vishal");
		in.add("Shanu");
		in.add("Ankit");
		in.add("Yami");
		in.add("Sandhya");
		in.add("Jyoti");
		in.forEach((k) -> {
			im.add(k);
		});
		System.out.println(im);
	}
}
