import java.util.*;
public class factorial
{
    public static void main(String[] args)
   {
    int fact=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number to Find the Factorial ");
    int num = sc.nextInt();
    for(int i=1;i<=num;i++)
    {
      fact = fact*i; 
    }
    System.out.println("factorial of" + num+ "is" + fact);
    sc.close();
   }

 

}