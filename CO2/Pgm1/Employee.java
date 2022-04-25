import java.util.*;
class Employee
{
	int eno;
	String name;
	int salary;
	Scanner s=new Scanner(System.in);
    void getDetails()
    {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Employee ID: ");
	this.eno=s.nextInt();
	System.out.println("Enter Employee Name: ");
	this.name=s.next();
	System.out.println("Enter Employee Salaray: ");
	this.salary=s.nextInt();
    }
    void display()
    {
	System.out.println("Employee ID: "+this.eno);
	System.out.println("Employee Name: "+this.name);
	System.out.println("Employee Salary: "+this.salary);
    }
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	Employee[] a1=new Employee[5];
	System.out.println("Enter the total number of Emp: ");
	int n=s.nextInt();
	int f=0;
	for(int i=0;i<n;i++){ 
		a1[i]=new Employee();
		a1[i].getDetails(); 
	}
	System.out.println("Enter the id to be serached:");
	int id=s.nextInt();
	for(int j=0;j<n;j++){ 
		if(id==a1[j].eno){
		   a1[j].display();
		   f++;
		   break;
		}
		else
		   f++;
	}
	if(f==0){
	System.out.println("No match data found");}
}
}
	
