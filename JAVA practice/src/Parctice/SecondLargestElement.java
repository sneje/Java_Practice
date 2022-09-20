package Parctice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SecondLargestElement {
public static void main(String[] arg) {
	int[] a= {10,10,2,3,55,55,27,30,};
	
	TreeSet<Integer> values=new TreeSet<Integer>();
	for(int value:a)
		values.add(value);
	
	ArrayList al=new ArrayList(values);
	System.out.print(al.get(al.size()-2));
}
}
