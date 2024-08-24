package JavaPrograms;

import java.util.Arrays;

public class Sorting_Strings_in_Array {

	public static void main(String[] args) 
	{
		//Sorting Strings in Array
		
		char a[] = {'A','D','B','E','C'};
		
		System.out.println("Array before sorting"+""+Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("Array after sorting"+" "+Arrays.toString(a));
		

	}

}
