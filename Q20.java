import java.util.Scanner;
class Q20{
public static void main(String a[])
{
      Scanner sc=new Scanner(System.in);
              int num1=sc.nextInt();
              int num2=sc.nextInt();
         for(int i=num1;i<=num2;i++)
        {
                
              int flag=0;
            for(int j=2;j<i;j++)
                 { 
                     if(i%j==0)
                         {
                            flag=1;  
                                
                         }
                 }
                      if(flag==0)
                       {
                           System.out.println(i);
                        }
         }    
}
}