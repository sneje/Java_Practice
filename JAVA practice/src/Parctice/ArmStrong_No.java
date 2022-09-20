package Parctice;

public class ArmStrong_No {
	public static void main(String[] arg) {
		int no=153;
		int temp=no;
		int reminder=0;
		int result=0;
		
		while(temp!=0){
			reminder=temp%10;
			result=result+(reminder*reminder*reminder);
			temp=temp/10;
		}
		  System.out.println(result );
      if(result==no) 
	  System.out.print(no +" is Armstrong");
  else 
	 System.out.print(no +" is not Armstrong");

	  
  
}
}