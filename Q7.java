import java.util.*;
class Q7{
public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
     System.out.println("enter number of subjects");
     double sub=sc.nextInt();
     double sum=0;
     for(int i=0;i<sub;i++)
         {  
           System.out.println("enter marks for sub"+i);
            double marks=sc.nextDouble();
         sum+=marks;
          }
        System.out.println(sum);
        double percentage=(sum/(sub*100))*100;
        System.out.println("percentage is"+percentage);
      }


}