package Parctice;

public class HibonichiSeries {
	public static void main(String[] arg) {
		int a=0;
		int b=1;
		int c=0;
		for(int j=0;j<10;j++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
	}

}
