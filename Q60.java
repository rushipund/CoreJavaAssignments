import java.util.Scanner;
class InvalidFeeException extends Exception{
	
}



interface StudentFee{
	@Override
	void getfee(String name,int fees) ;
}
class Studentss implements StudentFee{
	String name;
	int fees;
	public void getfee(String name,int fees) throws InvalidFeeException{
		if(fees>0||fees<10000) {
		this.name=name;
		this.fees=fees;
		System.out.println(" name "+name+" and "+" fees "+fees);
		}else {
			throw new InvalidFeeException();
		}
	}
	
}


public class Q60 {

	public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in);	
StudentFee s=new Studentss();
    System.out.println("enter name");
    String name=sc.next();
    System.out.println("enter the fees");
   int fees=sc.nextInt();
try {
	s.getfee(name, fees);
} catch (InvalidFeeException e) {
System.out.println(e);
} 

	
	}

}
