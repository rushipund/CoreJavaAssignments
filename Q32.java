



class Students {
    private int rollno;
    private String name;
    static int noOfObjects=0;
    {
    	noOfObjects++;
    }
	
	void setData(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	void ShowData() {
		System.out.println("Rollno is"+" "+rollno+" and "+"name is"+" "+name);
	}
}
public class Q32 {

	public static void main(String[] args) {
		Students s1=new Students();
		Students s2=new Students();
		s1.setData(95, "rushi");
		  s1.ShowData();
		s1.setData(93, "ushi");
		  s1.ShowData();
		 System.out.println("number of objects are"+Students.noOfObjects); 
	}

}
