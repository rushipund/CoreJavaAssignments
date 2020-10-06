import java.util.Scanner;

/*Create a class Circle that has two data members, one to store the radius and
another to store area and three methods first init() method to input radius from user,
second calculateArea() method to calculate area of circle and third display() method to display values of radius and area
. Create class CircleDemo ( main class) that creates the Circle object and calls init(), 
calculateArea() and display() methods*/


class Circle{
	private double radius;
	private double area;
	final double pi=3.14;
void init(double radius)
{
this.radius=radius;
}
void CalculateArea() {
	this.area=pi*(Math.pow(radius, 2));
}
void display() {
	System.out.println("area of circle is"+area);
}
}
public class Q34 {

	public static void main(String[] args) {
	Circle c=new Circle();
	System.out.println("enter the radius of circle");
	Scanner sc=new Scanner(System.in);
	double radius=sc.nextDouble();
	c.init(radius);
	c.CalculateArea();
	c.display();

	}

}
