package JavaPrograms;

public class Operators {

	public static void main(String[] args) 
	{
		//Arithmetic Operators + , - , * , / , %
		System.out.println("Arithmetic Operators");
		
		
		int a=50;
		int b=2;
		
		System.out.println(a+b); //Addition
		System.out.println(a-b); //Subtraction
		System.out.println(a*b); //Multiplication
		System.out.println(a/b); //Division
		System.out.println(a%b); //Percentile
		
		System.out.println("===================================================================================");
		
		
		//Relational Operators > , < , >= , >= , != , ==
		System.out.println("Relational Operators");
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		System.out.println("===================================================================================");
		
		
		//Logical Operators  & , || , !
		System.out.println("Logical Operators");
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		System.out.println("===================================================================================");
		
		
		//Logical Operators with Relational Operators
		System.out.println("Logical Operators with Relational Operators");
		
		int a1,b1;
		a1=10;
		b1=20;
		
		boolean bln1 = a1>b1; // False
		boolean bln2 = a1<b1; // True
		boolean bln3 = a1==b1; // False
		
		System.out.println(bln1&&bln2);
		System.out.println(bln2||bln3);
		System.out.println(!bln1);
		
		System.out.println("===================================================================================");

		
		//Increment Operators
		System.out.println("Increment Operators");
		
		a=10;
		a++;  //Post Increment
	  	    
	    System.out.println(a);  
	    
	    ++a;  //Pre Increment
	    System.out.println(a);
	    
	    
	    //Decrement Operators
		System.out.println("Decrement Operators");

	    
	    a=10;
		a--;  //Post Decrement
	  	    
	    System.out.println(a);  
	    
	    --a;  //Pre Decrement
	    System.out.println(a);
	    
		System.out.println("===================================================================================");

	    
		//Assignment Operators
		System.out.println("Assignment Operators");
		
		int a2 = 50;
		int b2 = 10;
		
		int c = a+b;
		
		System.out.println(c);
		
		System.out.println("===================================================================================");

		
		//Ternary Operators
		System.out.println("Ternary Operators");
		
		

		
	    
	    
	    		
		
		
		
		
		
		
		
		

	}

}
