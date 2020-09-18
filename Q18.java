import java.util.Scanner;
class Q18{
 public static void main(String a[]){

       Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            int flag=0;
        for(int i=2;i<num;i++)
         {
            if(num%i==0){
                      flag=1;
                        }
      }
        if(flag==0)
             {
            System.out.println("number is prime number");
             }else{
              System.out.println("not a prime number");
              }
            
}



}