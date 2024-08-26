package OOPS_Concepts;

public class static_keyword {
	
	
	//static keyword we used in both veriables and methods
	//If we are using static method then we dont need to create an object of the class becuase static method are directly evoked within the class
    //If we call static method in the different class then we need to create an object
	
	
	static int a=10;
	
	int b=20;
	
	int c;
	
	static void print1()
	{
		System.out.println(a);
	}
	
	
	void print2()
	{
		System.out.println(b);
	}
	
	
	
	public static void main(String[] args) {
		//Here we can directly evoked the static method but for non static method we need to create an object for the class
		
		System.out.println(a);  //Static variable directly evoked
		
	//	System.out.println(b);  //this is not static variable thats why it is giving error because we need to create an object to evoked this
        
		print1();  //static method directly evoked
		
   //	print2();  //This is not static method thats why it gives error and we need object to evoked this method
		
		
		
	}

}
