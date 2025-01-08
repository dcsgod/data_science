import java.util.*;
public class loops
{
    public static void main(String[] args)
   {
     //Displaying Multiplication Table
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter The Number for Multiplication table");
     int num = sc.nextInt();
     for(int i=1;i<=10;i++)
     {
        System.out.println(num+"X"+i+"="+(num*i));
     }
     //Sum of n number
     int sum=0;
     System.out.println("Enter number to find sum");
     int n = sc.nextInt();
     for(int j=0;j<=n;j++)
     {
       sum = sum+j;
     }
     System.out.println("Sum is"+sum);

   
     
     sc.close();
     
   }

 

}