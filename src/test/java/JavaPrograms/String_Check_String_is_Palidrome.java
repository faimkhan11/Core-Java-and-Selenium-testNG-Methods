package JavaPrograms;

public class String_Check_String_is_Palidrome {

	public static void main(String[] args) 
	{
		//Check String is palindrome 
		
		String s = "MADAM";
		String reverse = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i);	
  
	    }
		
		System.out.println(reverse);
		
		if(reverse.equals(s))
		{
			System.out.println("String is Palindrome");
		}
		else 
		{
			System.out.println("String is not Palindrome");
		}
		
		String s1 = "www@google";
		System.out.println(s1.replace("@", ""));
		
		
		String s2 = "   www    .    google   .   com";
		System.out.println(s2.replace(" ", ""));
		
		
		String s3 = "Selenium";
		int count=0;
		
		for(int i=0;i<=s3.length();i++)
		{
			count++;
		}
		System.out.println(count);
		
		
		
	}

}
