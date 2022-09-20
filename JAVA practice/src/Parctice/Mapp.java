package Parctice;

import java.util.HashMap;
import java.util.Set;

public class Mapp {
public static void main(String[] arg) {
	HashMap<Integer,String> names=new HashMap<Integer,String>();
	names.put(1, "Sudarshan");
	names.put(2, "Shantinath");
	names.put(3, "neje");
	names.put(3, "asasdcc");
	names.put(4, "Sudarshan");
	
	Set<Integer>Keys=names.keySet();
	
	
	for(int key:Keys)
   System.out.println(key+ " "+names.get(key));
	
	
}
}
