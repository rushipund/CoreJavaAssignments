package Q50onwards;

public class Q53 {

	public static void main(String[] args) {
    String s1[]= {"67", "89", "23", "67", "12", "55", "66"};
	int sum=0;
    for(String a:s1)
	{ 
	  int i=Integer.parseInt(a);
	  sum+=i;
	}
    System.out.println(sum);
	
	}
}
