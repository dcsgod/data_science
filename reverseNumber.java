import java.util.*;
public class reverseNumber
{
    public static void main(String[] args)
   {
    int num,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter The number");
    num = sc.nextInt();
    //int temp = num;
    while(num>0)
    {
        int digit=num%10;
        sum = (10*sum+digit);
        num= num/10;
       
    }
     System.out.println("reverse is"+sum);
     sc.close();
   }

 

}