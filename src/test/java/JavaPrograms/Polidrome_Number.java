package JavaPrograms;

public class Polidrome_Number {

	public static void main(String[] args) 
	{
		//Check number is Polidrome or not
		
		int num = 121;
		int reverse=0;
		int reminder;
		
		while(num>0)
		{
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
			
		}
		
		System.out.println(reverse);
		
		if(reverse==121)
		{
			System.out.println("Number is Polidrome");
		}
		else
		{
			System.out.println("Number is not Polidrome");
		}
		
		

	}

}
