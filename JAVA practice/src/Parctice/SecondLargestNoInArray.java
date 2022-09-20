package Parctice;

import java.util.ArrayList;
import java.util.TreeSet;

public class SecondLargestNoInArray {
	public static void main(String[] arg) {
		int ar[] = {12,55,26,8,66,74,89,5,6,78,559,9,5};
		TreeSet<Integer>a=new TreeSet<Integer>();
		for(int b:ar)
		a.add(b);
		
		ArrayList<Integer> al=new ArrayList<Integer>(a);
		//for(int j=0;j<=ar.length-1;j++)
		System.out.print(al.get(al.size()-2));
	}

}
