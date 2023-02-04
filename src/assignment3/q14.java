package assignment3;
import java.util.HashMap;
public class q14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Java program to get the value of a specified key in a map.
		
		HashMap<Integer,String> in = new HashMap<Integer,String>();
		in.put(10, "Ankit");
		in.put(20, "Shanu");
		in.put(30, "Jyoti");
		in.put(40, "Vishal");
		in.put(50, "Sandhya");
		in.put(60, "Yami");
		in.put(70, "Acchu");
		Integer m = 40;
		
		in.forEach((k,v) -> {
			if (k == m) {
				String s = (String)in.get(k);
				System.out.println(s);
				
		}  
			});
	
		

	}

}
