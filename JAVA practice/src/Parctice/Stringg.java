package Parctice;

import java.util.HashMap;
import java.util.Set;

public class Stringg {
	public static void main(String[]arg) {
		String s = "sndncsjcsljcjczzxbihvvcdskcsdcscsdivsdvnd";
		
		char[] a=s.toCharArray();
		HashMap<Character,Integer> samp=new HashMap<Character,Integer>();
		for(char str1:a)
			if(samp.containsKey(str1))
				samp.put(str1, samp.get(str1)+1);
			else
				samp.put(str1, 1);
		
		Set<Character> Keys=samp.keySet();
		for(char key:Keys)
			if(samp.get(keyz)>1)
				System.out.print(key +":"+samp.get(key));

		

		
	
	}
}



