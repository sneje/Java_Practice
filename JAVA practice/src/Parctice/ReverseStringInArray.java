package Parctice;

public class ReverseStringInArray {
	public static String reverseString(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		}
		return rev;
		
	}
	public static void main(String arg[]) {
		
		String[] a= {"Sudarshan ","Shantinath","Neje"};
		for(int j=0;j<=a.length-1;j++) {
			String b=a[j];
			a[j]=reverseString(b);
			
		}
		for(int j=0;j<=a.length-1;j++) {
			System.out.print(a[j]+" ");
		}
		
	}

}
