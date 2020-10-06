
class Employee{
	static int Empno=0;
	int empSalary;
	static int TotSalary=0;
	public Employee(int salary) {
	    Empno++;
		this.TotSalary+=salary;
	}
	void show() {
		System.out.println("number of employees are  "+Empno+"  totalsalary is = "+TotSalary);
	}
	
}


public class Q38 {

	public static void main(String[] args) {
		Employee e1=new Employee(1000);
		Employee e2=new Employee(1000);
		Employee e3=new Employee(1000);
		e3.show();

	}

}
