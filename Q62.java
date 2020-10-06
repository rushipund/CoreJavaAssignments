import java.util.Scanner;

public class Q62 {

	public static void main(String[] args) {
	MyThread m=new MyThread();
	Thread th=new Thread(m);
	th.start();
	
	

	}

}
class MyThread implements Runnable{
	
	public void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check whether its prime number or not");
		int num=sc.nextInt();
	    int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
			}
		
		sc.close();
	}
		if(flag==0)
			System.out.println("number is prime number");
		else System.out.println("number is not prime number");
	}
}
