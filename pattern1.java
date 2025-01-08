//import java.util.*;
public class pattern1
{
    public static void main(String[] args)
   {
/* 
    for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=5;j++)
          {
            System.out.println(j+" ");
          }
          System.out.println("");
     
        }
        
        for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=5;j++)
          {
            System.out.println(i+" ");
          }
          System.out.println("");
      }
      
      for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=5;j++)
          {
            System.out.println(i+j+" ");
          }
          System.out.println("");
      }
      */
      int count=0;
        
      for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=5;j++)
          {
              count++;
            System.out.format("%02d ",count);
          }
          System.out.println("");
      }
   }

 

}