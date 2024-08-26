package OOPS_Concepts;

public class Encapsulation 
{
  //All veriables should be private and we use get set method to invoke the veriables
	
	private String name;
	private String password;
	
	void setname(String stdname)
	{
		name=stdname;
		
		
	}
	
	String getname()
	{
		return name;
				
	}
	
	
	void setpassword(String stdpassword)
	{
		password=stdpassword;
	}
	
	String getpassword()
	{
		return password;
	}
}
