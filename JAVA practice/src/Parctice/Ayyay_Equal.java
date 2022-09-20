package Parctice;

import java.util.Arrays;

public class Ayyay_Equal {
	public static void main(String[] arg) {
		int[] a= {1,2,3,4};
		int[] b= {1,2,3,4};
		int c[]= {1,4,3,2};
		System.out.print(Arrays.equals(a, b));
		System.out.print(Arrays.equals(c, b));
		System.out.print(Arrays.equals(c, a));
		
		Arrays.sort(c);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
