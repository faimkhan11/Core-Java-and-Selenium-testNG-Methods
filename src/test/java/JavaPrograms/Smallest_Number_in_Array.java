package JavaPrograms;

public class Smallest_Number_in_Array {

	public static void main(String[] args) 
	{
		//Smallest number in array
		
		int a[] = {23,20,44,3,50};
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
		
				
		}

	}


