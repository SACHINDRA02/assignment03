package assignment3;

public class q18 {

	public static void main(String[] args) {
		
		/*	The string must be consists of only opening and closing brackets i.e. ‘(‘ and ‘)’.
		 An equal point is an index such that the number of opening
		    brackets before it is equal to the number of closing brackets from and after */
		
		String s = ("(((((()))))");
		int count = 0;
		int rev = s.length() -1;
		int i;
		int j = 0;
		System.out.println(s.length());
		for ( i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				count++;
			}
			for ( j = s.length()-1; j >= 0; j--) {
				
				if (s.charAt(j) == ')') {
					rev--;
					
				}
				break;
				
			}
			if ( count == rev )  
				break;
		}
		System.out.println(i);

	}

}
