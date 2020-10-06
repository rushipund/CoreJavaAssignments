import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println("enter the array elements");
			arr[i][j]=sc.nextInt();	
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			
			System.out.print(arr[i][j]);
		}
		System.out.println(" ");
	}
	int Rsum=0;
	int Lsum=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			if(i==j) {
				Rsum+=arr[i][j];
			}
			if(i+j==arr.length-1)
			{
				Lsum+=arr[i][j];
			}
		}
		
	}
	System.out.println("sum of right diagonal elements is"+Rsum);
	System.out.println("sum of left diagonal elements is"+Lsum);
	System.out.println("sum of all diagonal elements is"+" "+(Rsum+Lsum));
	}

}
