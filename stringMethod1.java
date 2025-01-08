//import java.util.*;
public class stringMethod1
{
    public static void main(String[] args)
   {
    String str=new String("VScode");
        
    
    System.out.println(str.length());
    int len=str.length();
    System.out.println(len);
    
    
    String str2=str.toUpperCase();
    System.out.println(str2);
    
    
    str=str.trim();
    System.out.println(str);
    
    String str3=str.substring(3);
    System.out.println(str3);
    
    String str4=str.replace('e', 'M');
    System.out.println(str4);
    
    System.out.println(str2+ " " +str);
    

   }

 

}