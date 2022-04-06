public class employee{
	int Rid;
	String Name;
   	long Phone;
	String Des;
	String Dep;
	
	public employee(int r_id,String N_ame, long Pno, String desi, String dept){
		Rid=r_id;
		Name=N_ame;
		Phone=Pno;
		Des=desi;
		Dep=dept;
	}
	void Dis(){
		System.out.println("\nRecord id : "+Rid);
   		System.out.println("Name : "+Name);
		System.out.println("Phone Number : "+Phone);
		System.out.println("Designation : "+Des);
		System.out.println("Department: "+Dep);
	}

	public static void main(String [] args){
	employee e1= new employee(123,"Prejin Pr",9633884838L,"HR","marketing");
	e1.Dis();
	}
}

        
		
	
		