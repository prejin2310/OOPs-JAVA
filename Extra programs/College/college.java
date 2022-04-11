class college
{
	class staff
	 {
	   String sname;
	   String sdept;
	   String sdesg;
	   public void getData(String name,String dept,String desg)
            {
		sname=name;
		sdept=dept;
		sdesg=desg;
	    }
	   public void Display()
	    {
		System.out.println("Name of Staff: "+sname);
		System.out.println("Designation of Staff: "+sdesg);
		System.out.println("Department of Staff: "+sdept);
	    }
         }
        static class student
         {
	   String name;
	   String clas;
           String dept;
	   public void getData(String s_name,String s_class,String s_dept)
	   {
		name=s_name;
		clas=s_class;
		dept=s_dept;
	   }
           public void Display()
	    {
		System.out.println("Name of Student: "+name);
		System.out.println("Class of Student: "+clas);
		System.out.println("Department of Studnet: "+dept);
	    }
         }
       public static void main(String [] args)
       {
        college c1 = new college();
	college.staff sff=c1.new staff();
        
	college.student stu= new college.student();

        System.out.println("\nStaff Details ");
	sff.getData("Manu","Office","Manager");
        sff.Display();
 	System.out.println("\n");
	System.out.println("Student Details ");
	stu.getData("Aswathy","S2","MCA");
        stu.Display();
    
        }
}