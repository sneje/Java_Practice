package Parctice;

public class Array_Litral {
	 static int Empty;
	public static void main(String[] arg) {
	int [] b= {12,32,12,34,10,13,20};
	
	for(int i=0;i<=b.length;i++) {
		for(int z=i+1;z<b.length;z++) {
			if(b[i]>b[z]) {
				Empty=b[i];
				b[i]=b[z];
				b[z]=Empty;
			}
			
		}
		
	}
	for(int c=b.length-1;c>=0;c--) {
		System.out.print(b[c] +" ");
	}
	
	

	
		
	}

}
