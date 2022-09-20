package Parctice;

public class Reverse_String {
	public static void main(String[]arg) {
		String a="Sudarshan";
		char[] b=a.toCharArray();
		
		for(int j=a.length()-1;j>=0;j--) {
			System.out.print(a.charAt(j));
		}
	}

}
