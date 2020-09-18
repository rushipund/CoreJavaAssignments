import java.util.Scanner;
class Q17{
 public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          int reverse=0;
       while(num != 0)
    {
      reverse = (reverse*10);           //num=123......12.........
      reverse = (reverse + num%10);    //reverse=3.....32....321
      num = (num/10);                 //num=12.........1..........
    }
System.out.println("reversed number is"+reverse);
}


}