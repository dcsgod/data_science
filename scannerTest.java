import java.util.*;
public class scannerTest
{
    public static void main(String[] args)
   {
       
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a integer");
      int x = s.nextInt();
      System.out.println("Enter a Float number");
      float y = s.nextFloat();
      System.out.println("Enter a string");
      String z = s.next();
      System.out.println("integer is "+x);
      System.out.println("float is "+y);
      System.out.println("String is " + z);
      s.close();
    }
    }
    

 

