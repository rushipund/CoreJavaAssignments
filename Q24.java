import java.util.*;
  class Q24{
      public static void main(String args[])
            {
               int arr[]={1,2,3,4,5,6,7,8,9};
           System.out.println("search for the array element");
           Scanner sc=new Scanner(System.in);
             int flag=0;
             int tofind=sc.nextInt();
              outer:
             for(int i=0;i<arr.length;i++)
                     { 
                       if(arr[i]==tofind)
                         { 
                                flag=1;                      
                          }
                         
                      
                     }
                    if(flag==1)
                       {System.out.println("element found");}
                          else{System.out.println("not found");}


             }
}