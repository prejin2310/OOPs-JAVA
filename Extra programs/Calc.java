import java.util.*;
public class Calc
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int a,b,res,ch;
  System.out.print("Enter the Number 1: ");
  a=s.nextInt();
  System.out.print("Enter the Number 2: ");
  b=s.nextInt();
  System.out.println("1.Add \n 2. Sub \n 3. Mul \n 4. Div Choose your option: ");
  ch=s.nextInt();
  
  switch(ch)
  {
   case 1:
       res=a+b;
       System.out.println("Result :"+res);
       break;
  case 2:
       res=a-b;
       System.out.println("Result :"+res);
       break;
  case 3:
       res=a*b;
       System.out.println("Result :"+res);
       break;
  case 4:
       res=a/b;
       System.out.println("Result :"+res);
       break;
  default:
      System.out.println("Invalid Input");
      break;
  }
 }
}
