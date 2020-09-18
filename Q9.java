import java.util.Scanner;
   class Q9{
            public static void main(String args[])
                 {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter number of days");
                    int days=sc.nextInt();
                     int year=days/365;
                     int months=days%365;
                     int months2=months/30;
                     int days2=months%30;
                    System.out.println(year+"year"+months2+"months"+days2+"days");                    

                 }



}