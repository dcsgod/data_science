import java.util.*;
public class areaOfTriangleThreeSide
{
    public static void main(String[] args)
   {
      
    double s,a,b,c,area;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the three side of the triangle");
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();

    s= (a+b+c)/2;
    area = Math.sqrt( s*(s-a)*(s-b)*(s-c));
    System.out.println("Area of Given Triangle is"+area);
    sc.close();

   }

 

}