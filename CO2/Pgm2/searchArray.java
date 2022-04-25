import java.util.*;
class searchArray{
public static void main(String [] args)
{
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the size of array: ");
	int n=s.nextInt();
	String a[]= new String[100];
	boolean state=false;
	for(int i=0;i<n;i++)
	{
		System.out.print("Enter the String :");
		a[i]=s.next();
    	}
 	System.out.print("Enter the element to be search: ");
 	String item=s.next();
	int pos=0;
     	for(int i=0;i<=n;i++)
     	{
		if(a[i].equals(item)){
			pos=i+1;
 			break;
		}
	}
        if(pos!=0){
	 System.out.println("Item found and Position "+pos);
	}
	else{
  	 System.out.println("Item not found"); 
	} 	
}
}
			
	  
 
