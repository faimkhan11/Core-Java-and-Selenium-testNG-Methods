package JavaPrograms;

public class Sum_of_Elements_in_Array {

	public static void main(String[] args) 
	{
		//Sum all elements in array
		
		int a[]= {1,2,3,4,5};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);

	}

}
