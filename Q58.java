import java.util.Scanner;

/*
58.Store name of weekdays in an array (starting from “Sunday” at 0 index).
Ask day position from user and print day name.
Handle array index out of bound exception and give proper message if user enter day index outside range (0-6). 
*/



public class Q58 {

	public static void main(String[] args) {
	String arr[]= {"Sunday","Monday","Tuesday","Wednsday","Thursday","Friday","Saturday"};
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the dayposition");
     int dayposition=sc.nextInt();
     try {
    	 String day=arr[dayposition];
    	  System.out.println(day);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("enter valid dayposition");
	}
     
    
	}

}
