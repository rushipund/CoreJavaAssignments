import java.util.Scanner;
class Studentee{
  String name;
   int age;
	int rollno;
	int score;
	public Studentee(String name,int age,int rollno,int score) {
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.score=score;
		
	}
}
public class Q40 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Studentee arr[]=new Studentee[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("enter the name of student");
		String name=sc.next();
		System.out.println("enter age of student");
		int age=sc.nextInt();
		System.out.println("enter rollno");
		int rollno=sc.nextInt();
		System.out.println("enter marks");
		int score=sc.nextInt();
		Studentee s=new Studentee(name,age,rollno,score);
		arr[i]=s;
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i].score<50) {
			System.out.println("student scored between 0-50");
		}else if(arr[i].score>50&&arr[i].score<65) {
			System.out.println("student scored 50-65"+arr[i].name);
			}else if(arr[i].score>65&&arr[i].score<80) {
				System.out.println("student scored 65-80"+arr[i].name);
			}else {
				System.out.println("Student scored 80-100"+arr[i].name);
			}
			}
		
	}
	}


