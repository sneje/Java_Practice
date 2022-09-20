package Parctice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class ArraySOrt {
	public static void main(String[] arg) {
		int ar[] = {12,55,26,8,66,74,89,5,6,78,559,9,5};
		TreeSet str=new TreeSet();
		for(int z:ar)
			str.add(z);
		ArrayList<Integer> al=new ArrayList<Integer>(str);
		System.out.print(al.get(al.size()-1));
			
		
	}

}
