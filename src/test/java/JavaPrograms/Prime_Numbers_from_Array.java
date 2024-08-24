package JavaPrograms;

public class Prime_Numbers_from_Array {

	public static void main(String[] args) 
	{
		//Print Prime Numbers from array
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int num;
		
		for(int i=0;i<a.length;i++)
		{
			num=a[i];
			
			if(num%2!=0 && num%3!=0 )
			{
				System.out.println(num+" "+"is Prime Number");
			}
		}

	}

}
