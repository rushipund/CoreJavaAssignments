import java.util.*;
class Q8{
   public static void main(String args[])
       {
            Scanner sc=new Scanner(System.in);
            double SI;
            System.out.println("enter principal amount");
            double PA=sc.nextDouble();
            System.out.println("enter Rate of Interest");
            double rate=sc.nextDouble();
            System.out.println("enter Duration T");
            double T=sc.nextDouble();
            SI=(PA*(1+rate*T));
          System.out.println("simple interest is"+SI);
 
         }

}