package JavaPrograms;

public class Smallest_of_Three_Numbers {

	public static void main(String[] args)
	{
		// Check which number is Smallest
		
		int a,b,c;
		a=10;
		b=20;
		c=30;
		
		if(a<b && a<c)
		{
			System.out.println("a is smallest");
		}
		else if(b<a && b<c)
		{
			System.out.println("b is smallest");
		}
		else
		{
			System.out.println("c is smallest");
		}

	}

}
