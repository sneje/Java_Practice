package Parctice;

public class RemoveSpaces {
public static void main(String[]arg) {
	String a="Sx`4324`2365$!^^&@&%%%&%&%&XFDXFX!**&vvvvvcds";
	String b=a.replaceAll("[a-zA-Z0-9]","");
	System.out.print(b);
	
}
}
