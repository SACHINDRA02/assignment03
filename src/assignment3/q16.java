package assignment3;
import java.util.Arrays;
public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"abcd",  "abcopq", "abcefg", "abcytr", "abcdbcfjdkdk"};
		String result = s[0];
		for(int i = 1; i < s.length; i++) {
			while(s[i].indexOf(result) != 0) {
				result = result.substring(0, result.length() - 1);
				if(result.isEmpty()) System.out.println("no prefix found");
				
			}
		}
			
		System.out.println("prefix is: " + result);
		
	}

}
