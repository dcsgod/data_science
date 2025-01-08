//WAP TO CALCULATE AREA OF TRIANGLE.

import java.util.*;

public class areaOfTriangle
{

    public static void main(String args[])
    {
      double b,h,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base and height");
        b= sc.nextDouble();
        h = sc.nextDouble();
        area = (0.5*b*h);
        System.out.println("Area is"+ area);
       sc.close();
        

       
    }




}
