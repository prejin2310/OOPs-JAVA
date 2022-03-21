import java.util.*;
public class Array
{
 public static void main(String [] args)
 {
  
  Scanner s=new Scanner(System.in);
  int a[][]=new int [2][3];
  for(int i=0;i<2;i++)
  {
    for(int j=0;j<3;j++)
    {
     System.out.print("Enter data "+i+j+" ");
     a[i][j]=s.nextInt();
    }
  }
  System.out.println("Display 2D Array");
  for(int i=0;i<2;i++)
  {
    for(int j=0;j<3;j++)
    {
     System.out.print(a[i][j]+" ");
    }
    System.out.println();
  }
}
}