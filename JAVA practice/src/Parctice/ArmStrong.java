package Parctice;

public class ArmStrong {
public static void main(String[]arg) {
	int Checkno=371;
	int temp=Checkno;
	int remaider=0;
	int result=0;
	
	while(temp!=0) {
		remaider=temp%10;
		result=result+(remaider*remaider*remaider);
		temp=temp/10;
	}
	if(result==Checkno)
		System.out.print(Checkno +"is Armstrong");
	else
		System.out.print(Checkno +"is  not Armstrong");
}
}
