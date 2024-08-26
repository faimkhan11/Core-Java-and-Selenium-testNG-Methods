package OOPS_Concepts;

public class Polymorphism 

        //We can achive polymorphysm using overloading
		//We can create multiple methods with the same name but we need to pass different parameters or data types

{
	
	void m(String name)
	{
		System.out.println(name);
	}
	

	void m(int id)
	{
		System.out.println(id);
	}
	
	
	void m(char section)
	{
		System.out.println(section);
	}
	
	
	void m(float num)
	{
		System.out.println(num);
	}
	
	
	
}

