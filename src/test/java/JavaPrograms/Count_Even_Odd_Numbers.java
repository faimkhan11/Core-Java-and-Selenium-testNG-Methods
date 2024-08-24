package JavaPrograms;

public class Count_Even_Odd_Numbers {

	public static void main(String[] args) 
	{
		//Count number of Even and Odd numbers 
		
		int num = 123456789;
		int reminder;
		int even=0;
		int odd=0;
		
		while(num>0)
		{
			reminder=num%10;
			
			if(reminder%2==0)
			{
			  System.out.println(reminder+" "+"is Even number");
			  even++;
			}
			else
			{
				System.out.println(reminder+" "+"is Odd number");
				odd++;
			}
			num=num/10;		
			
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
