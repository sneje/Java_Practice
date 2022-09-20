package Parctice;

import java.util.HashMap;
import java.util.Set;

public class DublictateString {
	public static void main(String[] arg) {
	
	String a="asdgsfdshsfefreghergregcgreghrgrgrgrgrgrg";
	char[] b=a.toCharArray();
	HashMap<Character,Integer> smap=new HashMap<Character,Integer>();
	
	for(char str:b)
		if(smap.containsKey(str))
			smap.put(str, smap.get(str)+1);
		else
			smap.put(str, 1);
	
	Set<Character>keys=smap.keySet();
	for(char key:keys)
	if(smap.get(key)>1)
		System.out.print(key+":"+smap.get(key)+",");
		
		
	
	

}
}