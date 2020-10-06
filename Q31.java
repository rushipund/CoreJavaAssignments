



class Student {
	private int rollno;
	private String name;
	
	void setData(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	void ShowData() {
		System.out.println("Rollno is"+" "+rollno+" and "+"name is"+" "+name);
	}
}
public class Q31 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setData(95, "rushi");
        s1.ShowData();
	}

}
