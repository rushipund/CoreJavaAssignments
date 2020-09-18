import java.util.Scanner;

class Q15{
            public static void main(String args[])
                 {
                   Scanner sc=new Scanner(System.in);
                     System.out.println("enter Gender");
                      char Gender=sc.next().charAt(0);
                      int age=sc.nextInt();
                       if((age>=18 && Gender=='F') || (age>=21 && Gender=='M'))
                           {
                               System.out.println("eligible for marriage");
                               }else{
                                 System.out.println("Not eligible for marriage");
                                       }



                   }



}