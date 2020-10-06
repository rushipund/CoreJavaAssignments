import java.util.Scanner;

class Student{
	int rollno;
	double percentage;
	public Student() {
	}
	public Student(int rollno,double percentage){
	   this.rollno=rollno;
	   this.percentage=percentage;
	}
	void show() {
		System.out.println("rollno is "+rollno+"  "+"percentage is "+percentage);
	}
}

class CollegeStudent extends Student{
	String Semester;
	public CollegeStudent() {
		
	}
	public CollegeStudent(int rollno,double percentage,String Semester)
	{ 
		super(rollno, percentage);
		this.Semester=Semester;
	}
	void show() {
		super.show();
		System.out.println("Semester number is"+Semester);
	}
}

class SchoolStudent extends Student{
	String ClassName;
	public SchoolStudent() {
		
	}
	public SchoolStudent(int rollno,double percentage,String ClassName) {
		super(rollno,percentage);
		this.ClassName=ClassName;
	}
	void show() {
		super.show();
		System.out.println("Student is in "+ClassName+"  "+"class");
	}
}
public class Q45 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   Student s1=new CollegeStudent(95, 67, "first");
	   Student s2=new CollegeStudent(96, 70, "second");
	   Student s3=new SchoolStudent(25, 58, "Tenth");
	   Student s4=new SchoolStudent(55, 89.69, "Twelth");
	   Student arr[]= {s1,s2,s3,s4};
	   for(Student r:arr)
	   {
		   r.show();
		   if(r.percentage>80)
		   {
			   System.out.println(r.rollno+"is having A+ grade");
		   }
		 
	   }
	   System.out.println("enter rollno");
	   int Rollno=sc.nextInt();
	   for(Student r1:arr)
	   {
		   if(r1.rollno==Rollno)
		   {
			   if(r1 instanceof CollegeStudent)
			   {
				   System.out.println("this is a college Student");
			   }
			   if(r1 instanceof SchoolStudent)
			   {
				   System.out.println("this is school Student");
			   }
		   }
		   
		   
	   }
	}

}
