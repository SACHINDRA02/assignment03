package assignment3;
import java.util.TreeMap;
public class q15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Java program to get a key-value mapping associated with the greatest key
		 *  and the least key in a map.
		 */
		
		TreeMap<Integer,String> in = new TreeMap<Integer,String>();
		in.put(10, "Ankit");
		in.put(20, "Shanu");
		in.put(30, "Jyoti");
		in.put(40, "Vishal");
		in.put(50, "Sandhya");
		in.put(60, "Yami");
		in.put(70, "Acchu");
		System.out.println("Largest key is " +in.lastKey());
		System.out.println("Smallest key is " +in.firstKey());
	
		

	}
}
