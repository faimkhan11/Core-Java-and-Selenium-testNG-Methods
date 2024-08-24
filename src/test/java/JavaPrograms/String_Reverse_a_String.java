package JavaPrograms;

import java.util.Arrays;

public class String_Reverse_a_String {

	public static void main(String[] args) 
	{
		
		//Approach 1: Reverse a String using charAt method
		
		String s1 = "Wlecome";
		String reverse1 = " ";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse1 =reverse1 + s1.charAt(i);
			
		}
		System.out.println(reverse1);
		
		
		//Approach 2: Reverse a string using Array
		
		String s2 = "Selenium";
	    String reverse2 = " ";
	    
	    char a[] = s2.toCharArray();
	    
	    for(int i=a.length-1;i>=0;i--)
	    {
	    	reverse2 = reverse2 + a[i];
	    }
	    System.out.println(reverse2);
	    
	    
	    //Approach 3: Reverse a String using String buffer
	    
	    StringBuffer s3 = new StringBuffer("Java");
	    
	    System.out.println(s3.reverse());
	    
	    //Approach 4: Reverse a String using String Builder
	    
	    StringBuilder s4 = new StringBuilder("Course");
	    
	    System.out.println(s4.reverse());
	    
	    
	    
	   /*Mutable Vs Immutable
	    
	     Mutable means can Change
	     
	     Immutable means cannot change
	     
	    */
	    //Mutable Example
	    
	    int a1[] = {30,10,50,40,20};
	    
	    Arrays.sort(a1);
	    
	    System.out.println(Arrays.toString(a1));
	    
	    
	    //Immutable Example
	    
	    String s5 = "Welcome";
	    String s6 = "to Java";
	    
	    System.out.println(s5.concat(" "+s6));
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		

}
}