import java.util.*;
public class countingDigit
{
    public static void main(String[] args)
   {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter The number");
    num = sc.nextInt();
    int count =0;
    while(num>0)
    {
        //int digit=num%10;
        num= num/10;
        count++;
    }
    System.out.println("count are"+count);
    sc.close();
   }

 

}