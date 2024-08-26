package OOPS_Concepts;

public class mainsClass {

	public static void main(String[] args)
	{
		//Here I call values from Company and Employee class by creating objects
		
		CompanyDetails cd = new CompanyDetails();
		cd.name="QaCompany";
		cd.type="Software Company";
		cd.city="Chandigarh";
		cd.display();
		
		
		
		EmployeeDetails ed = new EmployeeDetails();
		ed.empname="John";
		ed.dep="QA";
		ed.id=12345;
		ed.print();
		
		
		
		Polymorphism pm = new Polymorphism();
		pm.m("John");
		pm.m(123);
		pm.m('A');
		pm.m(1232323);
		
		
		
		Encapsulation en = new Encapsulation();
		en.setname("John");
		System.out.println(en.getname());
		en.setpassword("1234567");
		System.out.println(en.getpassword());
		
		
		
		
			
		
		
		
		

	}

}
