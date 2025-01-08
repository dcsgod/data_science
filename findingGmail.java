import java.util.*;
public class findingGmail
{
    public static void main(String[] args)
   {
      int l;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Your Email");
      String str=sc.nextLine();
      str=str.trim();
      l=str.indexOf('@');
      String str1= str.substring(l+1,str.length());

      if (str1.equalsIgnoreCase("gmail.com") == true)
      {
        System.out.println("it is Gmail");
      }
      else
      {
        System.out.println("it is Not a Gmail");
      }
      sc.close();

   }

 

}