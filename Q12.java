import java.util.*;
class Q12{
   public static void main(String args[])
            { 
              Scanner sc=new Scanner(System.in);
               double basicsal=sc.nextDouble();
                 double DA;
                 double HRA;
                 double GrossSal;
                if(basicsal<10000)
                      {
                      DA=(basicsal*0.9);
                      HRA=(basicsal*0.1);
                      GrossSal=(basicsal+HRA+DA);
                      System.out.println("Gross Salary is"+GrossSal);
                      }else
                      DA=(basicsal*0.98);
                      HRA=2000;
                      GrossSal=(basicsal+HRA+DA);
                      System.out.println("Gross Salary is"+GrossSal);     

             }


}