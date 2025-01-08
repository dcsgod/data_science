import java.util.*;
public class armstrongNumber
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
        temp= temp/10;
       sum = sum+(digit*digit*digit);
    }
    if(sum==num)
    {
        System.out.println("Armstrong number"+sum);
    }
    else
    System.out.println("Not Armstrong number"+num+"sum is"+sum);
    sc.close();
   }

 

}