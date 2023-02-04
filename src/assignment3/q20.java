package assignment3;
import java.util.ArrayList;
public class q20 {
public static void main(String[] args) {
		
		ArrayList <Integer> in = new ArrayList<Integer>();
		Integer[] arr = new Integer[3];
		int cnt =0;
		String s = "168.105.10.20";
		String[] ar = s.split("\\.");
			for(int i =0;i<4;i++) {
				in.add(Integer.parseInt(ar[i]));
				
			if(in.get(i)>0 && in.get(i)<255) {
					cnt++;
				}
			}
			if (cnt == 4) {
			System.out.println("Given IPv4 address is valid");
			}
		
		else {
			System.out.println("IPv4 Address is Not valid");
		}
}
}
