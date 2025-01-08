import java.util.*;
public class palindromeNumber
{
    public static void main(String[] args)
   {
    int num,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter The number");
    num = sc.nextInt();
    int temp = num;
    while(temp>0)
    {
        int digit=temp%10;
        sum = (10*sum+digit);
        temp= temp/10;
       
    }
    if(sum==num)
    {
        System.out.println("Paliindrome");
    }
    else
    {
        System.out.println("Not palindrome");
    }

     System.out.println("reverse is"+sum);
     sc.close();
   
   }

 

}