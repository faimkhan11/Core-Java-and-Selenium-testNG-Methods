package JavaPrograms;

import java.util.Arrays;

public class String_Split_Method {

	public static void main(String[] args) 
	{
		//This method is used to split the string the delimiters place
		
		String s1= "Hello@Welcome,to@the_Java";
		
		String s2 = "Hello World";
		
		String a[] = s1.split("@");
		
		System.out.println(a[2]);
		
		String a2[] = s2.split(" ");
		
		System.out.println(a2[0]);
		System.out.println(a2[1]);
		System.out.println(Arrays.toString(a2));
				

	}

}
