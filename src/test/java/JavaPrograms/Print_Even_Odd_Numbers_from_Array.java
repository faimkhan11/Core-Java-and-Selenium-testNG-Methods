package JavaPrograms;

public class Print_Even_Odd_Numbers_from_Array {

	public static void main(String[] args)
	{
		//Print Even and Odd Numbers from array
		
		int a[] = {1,2,3,4,5};
		int num;
		
		for(int i=0;i<a.length;i++)
		{
			num=a[i];
		
			if(num%2==0)
			{
				System.out.println(num+" "+"Number is Even");
				
			}
			else
			{
				System.out.println(num+" "+"Number is Odd");
			}
			
		}
		

	}

}
