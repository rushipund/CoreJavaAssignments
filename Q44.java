
class Faculty{
	int FacultyId;
	int Salary;
	
	void input(int FacultyId) {
		this.FacultyId=FacultyId;
		System.out.println(FacultyId);
	}
	void PrintSalary(int Salary) {
		this.Salary=Salary;
	}
}

class FullTimeFaculty extends Faculty{
	int BasicSal;
	int Allowance;
	void input(int BasicSal,int Allowance) {
		super.input(FacultyId);
		this.BasicSal=BasicSal;
		this.Allowance=Allowance;
		Salary=BasicSal+Allowance;
		
		System.out.println(Salary);
	}
}

class PartTime extends Faculty{
	int WorkingHours;
	int RatePerHours;
	void input(int workinghrs,int rateperhrs) {
		super.input(FacultyId);
	this.WorkingHours=workinghrs;
	this.RatePerHours=rateperhrs;
	Salary=WorkingHours*rateperhrs;
	System.out.println(Salary);
	}
	
}


public class Q44 {

	public static void main(String[] args) {
		 Faculty f1=new Faculty();
         f1.input(95);
       PartTime f2=new PartTime();
         f2.input(8, 50);
	}

}
