package JavaPrograms;

public class Reverse_Number {

	public static void main(String[] args) 
	{
		//Reverse a Number 12345
		
		int i = 56437654;
		int reverse = 0 ;
		
		
		while(i>0)
		{
			int reminder = i%10;
			reverse = reminder;
			i=i/10;
		    System.out.print(reverse);					
					
		}
			
		
		
		

	}

}
