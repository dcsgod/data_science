import java.util.*;
public class stringPractice
{
    public static void main(String[] args)
   {
    int l;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Email");
    String str=sc.nextLine();
    str=str.trim();
    l=str.indexOf('@');
    String userName=str.substring(0,l-1);
    String domain= str.substring(l+1,str.length());

    System.out.println("UserName is"+ userName);
    System.out.println("Domain is"+ domain);
    sc.close();

   }

 

}