package JavaPrograms;

public class Sum_of_Digits_in_a_Number {

	public static void main(String[] args) 
	{
		//Sum of digits in a number
		
		int num = 12345;
		int sum = 0;
		int reminder;
		
		while(num>0)
		{
			reminder = num%10;
			sum = sum + reminder;
			num=num/10;
			
		}
		System.out.println(sum);
	

	}

}
