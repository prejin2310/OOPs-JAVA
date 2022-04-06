class product
{
  String pcode,pname;
  int price;
 
  public product(String code, String name, int rs)
  {
    pcode=code;
    pname=name;
    price=rs;
  }
  public double Dis()
  {
    return price;
  }

public static void main(String [] args)
 {
  product p1=new product("A100","Prejin",5000);
  product p2=new product("A102","Renjith",3000);
  product p3=new product("A104","Anu",6000);

 if(p1.Dis()>=p2.Dis() && p1.Dis()>=p3.Dis())
  System.out.println(p1.pname+" Salary is high");
 if(p2.Dis()>=p3.Dis() && p2.Dis()>=p1.Dis())
  System.out.println(p2.pname+" Salary is high");
 if(p3.Dis()>=p2.Dis() && p3.Dis()>=p1.Dis())
  System.out.println(p3.pname+" Salary is high");
}
}
