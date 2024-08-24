package JavaPrograms;

public class Searching_Element_in_Array {

	public static void main(String[] args) 
	{
		//Searching Element in Array
		
		int a[] = {10,20,30,40,50};
		
		int searchNo = 20;
		
		int num;
		
		for(int i=0;i<a.length;i++)
		{
			num = a[i];
			
			if(num==searchNo)
			{
				System.out.println(num);
				break;
			}
		}
		

	}

}
