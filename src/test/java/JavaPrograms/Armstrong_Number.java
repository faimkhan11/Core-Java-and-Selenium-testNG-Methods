package JavaPrograms;

public class Armstrong_Number {

	public static void main(String[] args) 
	{
		//Find number is armstrong or not
		
		int num=123;
		int reminder;
		int result=0;
		
		while(num!=0)
		{
			reminder = num%10;
			result += Math.pow(reminder, 3);
			
			num=num/10;
		}
		
		if(result==123)
		{
			System.out.println("123 is a armstrong number");
		}
		else
		{
			System.out.println("123 is not a armstrong number");
		}
		
		
		
		
	}

}
