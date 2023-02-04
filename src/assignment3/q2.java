
package assignment3;
import java.util.ArrayList;

public class q2 {
public static void main(String[] args) {
		
		//	Write a Java program to reverse elements in a array list
		
		ArrayList<Integer> in = new ArrayList<Integer>();
		ArrayList<Integer> rev = new ArrayList<Integer>();
	    in.add(21);
	    in.add(31);
	    in.add(41);
	    in.add(51);
	    in.add(61);
	    for ( int i = in.size()-1; i >= 0 ; i--) {
	    	rev.add(in.get(i));
	    }
	    System.out.println(rev);
	}

}


