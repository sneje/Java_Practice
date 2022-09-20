package Parctice;

public class Pattern1 {
	public static void main(String[] arg) {
		for(int a=0;a<=5;a++) {
			for(int j=4-a;j>=0;j--) {
				System.out.print("  ");
			}
			for(int b=0;b<=a;b++) {
				System.out.print(" *");
			}
			System.out.println();
			
		}
		
	}

}
