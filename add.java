import java.util.*;
public class add
{
   
    public static void main(String[] args)
    {
        float a, b,c;
        System.out.println("enter two numbers");
        Scanner sc = new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextInt();
         c=a+b;
        System.out.println("sum is" +c);
       sc.close();
    }

}