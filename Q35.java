


class MathOpe{
	
	static int add(int a,int b) {
	 return a+b;
	}
	static int subtract(int a,int b) {
		return a-b;
	}
	static int multiply(int a,int b) {
		return a*b;
	}
	static int powerope(int a,int b)
	{
		return (int) Math.pow((int)a, (int)b);
	}
}
public class Q35 {

	public static void main(String[] args) {
	
		int a=MathOpe.add(1, 2);
		System.out.println("addition is"+a);
	
		int b=MathOpe.subtract(2, 1);
		System.out.println("subtraction is"+b);
     
        int c= MathOpe.multiply(2, 2);
        System.out.println("multiplication  is"+c);
	  
	   int d= MathOpe.powerope(2, 2);
	   System.out.println("power"+d);
	}

}
