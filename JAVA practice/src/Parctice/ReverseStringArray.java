package Parctice;

public class ReverseStringArray {
	  
	public static String reverse(String s) {
		 String result="";
		 char z[]=s.toCharArray();
		for(int a=z.length-1;a>=0;a--) { 
		result=	result+s.charAt(a);}
		return result;
		
			
	}
	
	
	public static void main(String[]arg) {
		
	String o="Sudarshan Shantinath Neje";
	String[] v=o.split(" ");
	Object String;
	for(int a=0;a<=v.length-1;a++) {
		String l=v[a];
		v[a]=reverse(v[a]);
		System.out.print(v[a]+" ");
		
	
	
	}}

}
