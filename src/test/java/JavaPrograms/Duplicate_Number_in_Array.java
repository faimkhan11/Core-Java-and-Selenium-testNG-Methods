package JavaPrograms;

public class Duplicate_Number_in_Array {

	public static void main(String[] args) 
	{
		//Find Duplicate number in array
		
		int a[] = {10,20,30,10,40,50,30};
		
		int num;
		int count=0;
		
		
		 for(int i = 0; i<a.length; i++) 
		 {  
	        for(int j = i + 1; j < a.length; j++) {  
	          if(a[i] == a[j])  
	          {
	              System.out.println(a[i]); 
	              count++;
	          }
		
	        }

	}
		 System.out.println("Duplicate Numbers is array"+" "+count);

}
}