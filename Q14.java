import java.util.Scanner;
class Q14{
     public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
          System.out.println("enter the year");
           int year=sc.nextInt();
            if(year%4==0)
              {
                   if(year%100==0) 
                          { 
                             if(year%400==0)
                                   {   
                                     System.out.println("this is leap year");
                                   }
                                   else 
                                         { 
                                          System.out.println("this is not a leap year");
                                          }            
                          }else
                                {
                                     System.out.println("this is leap year");
                                 }
                }else
                         {
                  System.out.println("this is not a leap year");
                            }

}
}