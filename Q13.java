import java.util.*;
class Q13{
 public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
              int num1=sc.nextInt();
              int num2=sc.nextInt();
              int num3=sc.nextInt();
        int greatest=(num2>num3 && num2>num1) ? num2:(num1>num2 && num1>num3) ? num1: num3 ;
             System.out.println("Greatest no. is "+greatest);

             }




}