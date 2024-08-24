package JavaPrograms;

public class Print_WeekDay_Number {

	public static void main(String[] args)
	{
		// Print weekday number according to the weekday

		String weekname = "Monday";
		
		switch(weekname)
		{
		case "Monday": System.out.println("1");
		break;
		
		case "Tuesday": System.out.println("2");
		break;
		
		case "Wednesday": System.out.println("3");
		break;
		
		case "Thursday": System.out.println("4");
		break;
		
		case "Friday": System.out.println("5");
		break;
		
		case "Saturday": System.out.println("6");
		break;
		
		case "Sunday": System.out.println("7");
		break;
		
		default: System.out.println("Wrong Input");
		
		}
	}

}
