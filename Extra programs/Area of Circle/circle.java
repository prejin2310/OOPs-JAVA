import java.util.*;
class circle
 { 
	double r,area;	
	   public circle(double radius)
	   {
 		r=radius;
		area=3.14*r*r;	
	   }

	public static void main(String [] args)
	{
           Scanner s= new Scanner(System.in);
	   System.out.print("Enter the Radius : ");
	   double radius=s.nextDouble();
 	   circle c1= new circle(radius);
	   System.out.println("Area od circle "+c1.area);
	}
}
