package JavaPrograms;

public class Largest_Number_in_Array {

	public static void main(String[] args)
	{
		//Find Largest number in Array
		
		int a[] = {1,20,220,50,100};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i]; //
			}
			
		}
		System.out.println(max);
		
	}

}
