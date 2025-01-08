import java.util.*;
public class calculator
{
    public static void main(String[] args)
   {
     // making A calculator

     Scanner sc = new Scanner(System.in);
     System.out.println("MENU");
     System.out.println("--------------------------");
     System.out.println("ADD");
     System.out.println("SUB");
     System.out.println("MUL");
     System.out.println("MOD");
     System.out.println("DIV");
     System.out.println("ENTER TWO NUMBER");
     
     int a= sc.nextInt();
     int b = sc.nextInt();
     sc.nextLine();
     System.out.println("ENTER THE OPERATION");
     String s =sc.nextLine();
     switch (s) 
     {
        case "ADD": 
        System.out.println("sum is"+(a+b));
            break;
        case  "SUB":
        System.out.println("subtract is"+(a-b));
        break;
        case "MUL":
        System.out.println("product is"+(a*b));
        break;
        case "MOD":
        System.out.println("MOd is"+(a%b));
        break;
        case "DIV":
        System.out.println("div is"+(a/b));
        break;
        default:
        System.out.println("Wrong Choice");
            break;
     }
     sc.close();

    }

 

}