package Q50onwards;
/*50.Explain the importance of toString() and equals() method of the Object class and 
override them on class Employee(empId,name,salary). 
a. Create class for main method(say XYZ),and accept five employees information and store in an array. 
Also ensure if entered empId already exist or not (use equals method). 
b. Display all employee info using toString method.
*/

import java.util.HashSet;

class Employee{
	int empId;
	String Name;
	int Salary;
	public Employee(int empId,String Name,int Salary) {
		this.empId=empId;
		this.Name=Name;
		this.Salary=Salary;
	}
	
	  @Override
	  public String toString() 
	  { 
		  return empId+" "+Name+" "+Salary;
		  
	  }
	  
	  @Override
	  public int hashCode()
	  { 
		  return empId%10;
		  }
	  
	  @Override public boolean equals(Object o)
	  {
	  
	     Employee e=(Employee)o;
	     return empId==e.empId;
	     }
	 
}
public class Q50 {

	public static void main(String[] args) {
		HashSet<Employee> h1=new HashSet<Employee>();
		h1.add(new Employee(95,"Rushi",1000));
		h1.add(new Employee(25, "Ashu", 2000));
		h1.add(new Employee(23, "shruti", 3000));
		h1.add(new Employee(23, "Anu", 6000));
		h1.add(new Employee(111, "Udit", 4000));
		h1.add(new Employee(87, "Ravi", 5000));
		h1.add(new Employee(95, "rupali", 4547));
	  for(Employee e:h1)
	  {
		  System.out.println(e);
	  }
	}

}
