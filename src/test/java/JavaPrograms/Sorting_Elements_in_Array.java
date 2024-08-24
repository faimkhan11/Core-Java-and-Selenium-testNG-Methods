package JavaPrograms;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class Sorting_Elements_in_Array {

	public static void main(String[] args) 
	{
		//Sorting elements in array
		
		int a[] = {10,50,20,30,60};
		
		System.out.println("Elements befor sorting"+" "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Elements after sorting"+" "+Arrays.toString(a));
		
	}

}
