//import java.util.*;
public class cheakBinary
{
    public static void main(String[] args)
   {
    // Binary Number
       int b= 101001010;
       String str = String.valueOf(b);
       System.out.println(str.matches("[01]+"));
//HexaDecimal Number
     int h = 1537654;
     String str1 = String.valueOf(h);
     System.out.println(str1.matches("[0-7]+"));

     // Date Format
     String d ="02/03/2023";
     
     System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

   }

 

}