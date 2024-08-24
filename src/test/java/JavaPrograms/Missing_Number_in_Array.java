package JavaPrograms;

public class Missing_Number_in_Array {

	public static void main(String[] args) 
	{
		int a[] = {1,3,4,5};
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		
		System.out.println(sum2-sum1);

	}

}
