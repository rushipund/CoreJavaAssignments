package Q50onwards;

import java.util.Scanner;

class SalaryException extends Exception{
	
	
}
class UDException{
	static void salary(float sal) throws SalaryException{
		if(sal>10000)
		{
			System.out.println("sal="+sal);
		}else {
			throw new SalaryException();
		}
	}
}
public class UserdefinedExceptions {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter salary");
	float s=sc.nextFloat();
	try {
		UDException.salary(s);
	} catch (SalaryException e) {
		System.out.println(e);
	}
	
	

	}

}
