package eg1;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		
		int ar[]= {12,2,3,45,6,6,6};
		System.out.println(ar);
		
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		int ar1[]=Arrays.copyOf(ar, ar.length+10);
		System.out.println(Arrays.toString(ar1));

	}

}