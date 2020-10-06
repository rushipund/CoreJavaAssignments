


interface Taxable{
	double Salestax=7;
	double IncomeTax=10.5;
	abstract void CalcTax();
}

class Employee implements Taxable{
	int EmpId;
	String name;
	int Salary;
	Employee(int empid,String name,int salary){
		this.EmpId=empid;
		this.name=name;
		this.Salary=salary;
	}
	@Override
	public void CalcTax() {
		int yearlysal=Salary*12;
		double tax=yearlysal*IncomeTax/100;
		System.out.println("incometax of"+name+" "+"is"+ tax);
		
	}
	
}
class Product implements Taxable{
	int pid;
	int price;
	int quantity;
	public Product(int pid,int price,int quantity) {
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	@Override
	public void CalcTax() {
	  int amt=price*quantity;
		double tax=amt*Salestax/100;
		System.out.println("tax on quantity"+" "+quantity+"product is"+tax);
	}
	
}
public class Q49 {

	public static void main(String[] args) {
		Taxable t=new Product(1, 100, 2);
		t.CalcTax();
		Taxable t1=new Employee(2, "rushi",10000);
		t1.CalcTax();

	}

}
