package OOPS_Concepts;

public class this_keyword {
	
	//this keyword is used when class veriables and local veriables are same 
	
	int a;
	int b;
	
	void values(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void print()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args)
	{
		//
		
		this_keyword tk = new this_keyword();
		tk.values(10, 20);
		tk.print();
		

	}

}
