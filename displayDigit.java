import java.util.*;
public class displayDigit
{
    public static void main(String[] args)
   {
    int num,digit;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter The number");
    num = sc.nextInt();
    while(num>0)
    {
        digit=num%10;
        num= num/10;
        System.out.println(digit);
    }
       sc.close();
   }

   

}