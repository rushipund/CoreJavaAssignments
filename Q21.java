import java.util.Scanner;
   class Q21{
      public static void main(String a[])
       {
          Scanner sc=new Scanner(System.in);
          int sum=0;  
          int arr[]=new int[10];
          for(int i=0;i<10;i++)
              {
                 arr[i]=sc.nextInt();
                  sum+=arr[i];
               }
           System.out.println("sum is"+sum);
           double avg=(double)(sum/10);
            System.out.println(avg);


       }
          }