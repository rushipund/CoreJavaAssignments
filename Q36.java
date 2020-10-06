
class MathOperation{
	
	void multiply(int a,int b) {
		System.out.println(a*b);
	}
	void multiply(double a,double b)
	{
		System.out.println(a*b);
	}
	void multiply(float a,float b,float c) {
		System.out.println(a*b*c);
	}
	void multiply(int arr[]) {
		int mul=1;
		for(int i=0;i<arr.length;i++)
		{
		mul=mul*arr[i];
		}
		System.out.println(mul);
	}
}
public class Q36 {

	public static void main(String[] args) {
		MathOperation m=new MathOperation();
		int arr[]= {1,2,3,4,5,6,7};
		m.multiply(arr);
		m.multiply(1, 2);
		m.multiply(2.4, 2.5);
        m.multiply(2.5F, 3.5F, 4.5F);		
	}

}
