package JavaPrograms;

public class Count_Number_of_Digit_in_Number {

	public static void main(String[] args) 
	{
		//Count number of digits in a number
		
		int num = 1234567;
		int reverse = 0;
		int reminder;
		int digits=0;
		
		while(num>0)
		{
			num=num/10;
			digits++;
							
		}
		System.out.println(digits);

	}

}
