package OOPS_Concepts;

public class EmployeeDetails {
	
	String empname;
	String dep;
	int id;
	
	void print()
	{
		System.out.println(empname);
		System.out.println(dep);
		System.out.println(id);
	}
	
	//Constructor: constructor does not return any value. We can create multiple constuctor in a class but having 
	//different parameters. constructor directly ivoked while creating object
	
/*	EmployeeDetails(String name)
	{
		empname=name;
	}
*/	
	

	public static void main(String[] args) 
	{
		EmployeeDetails emp = new EmployeeDetails();
		
		
		emp.dep="QA";
		emp.id=12345;
		emp.print();

	}

}
