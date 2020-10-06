import java.util.Scanner;

abstract class processor{
	int data;
	void show() {
		 System.out.println(data);
	}
	abstract void process();
}
class Factorial extends processor{
	Scanner sc=new Scanner(System.in);
	int i;
	int fact=1;
	void process() {
		System.out.println("enter the number of which factorial to be calculate");
		int number=sc.nextInt();
		for(i=1;i<number;i++)
		{
		  fact+=fact*i;
		}
		data=fact;
	}
}
class Circle extends processor{
	Scanner sc=new Scanner(System.in);
    final double pi=3.14; 
	void process() {
 		System.out.println("enter the radius of circle");
 		int r=sc.nextInt();
 		data=(int)(pi*r*r);
	}
	
}

public class Q48 {

	public static void main(String[] args) {
processor p=new Circle();
p.process();
p.show();
processor p1=new Factorial();
p1.process();
p1.show();
	}

}
