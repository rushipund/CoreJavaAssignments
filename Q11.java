import java.util.Scanner;
class Q11{
      public static void main(String args[])
          {
           Scanner sc=new Scanner(System.in);
           int a1=sc.nextInt();
           int a2=sc.nextInt();
         System.out.println(a1+" and "+a2);  
            a1=a1+a2;
            a2=a1-a2;
            a1=a1-a2;
         System.out.println(a1+" and "+a2);  
           }


}