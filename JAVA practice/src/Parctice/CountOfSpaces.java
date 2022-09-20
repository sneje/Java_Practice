package Parctice;

public class CountOfSpaces {
public static void main(String[]arg) {
	int c=0;
	String a="Sudarshan Shantinath Ne je";
	for(int j=0;j<=a.length()-1;j++) {
		
		if(a.charAt(j)==' ')
			c++;
	}
	System.out.print(c);
}
}
