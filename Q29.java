import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][4];
	int countofonedarray=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   int count=0;  
		   for(int j=0;j<arr[i].length;j++)
			   {
			   System.out.println("enter the elememts");
			   arr[i][j]=sc.nextInt();
			   count++;
			   
		   }
		   countofonedarray++;
		   System.out.println("for row"+" "+i+"the number of elements is"+count);
	   }
	   System.out.println("count of 1D arrays in 2D array is"+countofonedarray);
	   sc.close();
	}

}
