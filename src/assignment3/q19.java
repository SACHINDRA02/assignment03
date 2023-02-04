package assignment3;
import java.util.HashSet;

public class q19 {
	public static void main(String[] args) {
		
	
	      
			HashSet<Character> in = new HashSet<Character>();
			String s = "The quick brown fox jumps over the lazy dog";
			s = s.toLowerCase();
			for (int i = 0 ; i < s.length(); i++) {
				in.add(s.charAt(i));
			}
			if ( in.size() == 27) {
				System.out.println("Inputed String is Pangram");
			}
			else
				System.out.println("Not a Pangram");
			
		}

}
