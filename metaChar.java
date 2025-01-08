//import java.util.*;
public class metaChar
{
    public static void main(String[] args)
   {
//Replacing The Special Characters

     String str = "abc12A3##^$%&fhnsi";
     String str1 = str.replaceAll("[^a-z A-Z 0-9]","");
     System.out.println("String is "+str1);
//Replacing all the space From the String


     String str2 = "abc  12   A3      s   sd fh  nsi";
     String str3 = str2.replaceAll("\\s","");
     System.out.println("String is "+str3);
//Finding the number of Word of String
     String str4 = " abc def ghi jkl mno";
       String word[] = str4.split("\\s");
       System.out.println(word.length);

     
   }

 

}