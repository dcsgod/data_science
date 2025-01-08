import java.util.*;
public class cuboid
{
    public static void main(String[] args)
   {
      double l,b,h,area,volume;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Length,breath,and Height of cuboid");
      l = sc.nextDouble();
      b = sc.nextDouble();
      h = sc.nextDouble();

      area = 2*((l*b)+(b*h)+(l*h));
      volume =(l*b*h);

      System.out.println("Area is "+area);
      System.out.println("Volume is"+volume);
      sc.close();



   }

 

}