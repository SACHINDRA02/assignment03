package assignment3;

public class q17 {
public static void main(String[] args) {
		
		/*	Given a string of brackets, the task is to find 
		the number of opening brackets is equal to the number of closing brackets. */

		String s = "(((((((())))))))";
		int i ;
		int open = 0;
        int close = 0;
		for ( i = 0 ; i < s.length(); i++) {
				if(s.charAt(i) == '(') {
					open++;
				}
				if(s.charAt(i)== ')') {
					close++;
				}
			}
		if (open == close) {
			System.out.println("String contains equal brackets");	
		}
		}
}
