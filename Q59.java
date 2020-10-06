import java.util.Scanner;

/*
59.Create a class Voter(voterId, name, age) with parameterized constructor. 
The parameterized constructor should throw a checked exception if age is less than 18. 
The message of exception is “invalid age for voter ” 
*/
class Myexception extends Exception{
	
}
class voter{
	int VoterId;
	String name;
	int Age;
	public voter(int voterid,String name,int age) {
	   try {
		   if(age<18)
		   {
			   throw new Myexception();
		   }
			this.VoterId=voterid;
			this.name=name;
			this.Age=age;
	} catch (Myexception e) {
		System.out.println(e);
	}	
	}
}

public class Q59 {

	public static void main(String[] args) {
      voter v=new voter(1234, "RUSHI", 17);
	}

}
