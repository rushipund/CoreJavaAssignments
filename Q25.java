import java.util.Scanner;
class Q25{

      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8};
           int sumofeven=0;
           int sumofodd=0;
     for(int i=0;i<arr.length;i++)
        { 
             if(arr[i]%2==0)
               {
                sumofeven+=arr[i];
             
                  }else
                        {
                         sumofodd+=arr[i];
                         }

         }
            System.out.println("sum of even number is"+sumofeven);
            
           System.out.println("sum of odd number is"+sumofodd);





                                  }


}