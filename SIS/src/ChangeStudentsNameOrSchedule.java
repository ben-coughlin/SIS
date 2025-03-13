import java.util.Scanner;

public class ChangeStudentsNameOrSchedule
	{
		public static void StudentIsChanging()
		{
			System.out.println("You chose to change a students grade/schedule");
			
			System.out.println("Do you want to:");
			System.out.println("1. Change Grade");
			System.out.println("2. Switch Classes");
			
			Scanner userInput = new Scanner (System.in);
			int newAnswer = userInput.nextInt();
			
			
			if(newAnswer == 1) //change grade
				{
					GradeIsChanging();
				}
			
			
			else if(newAnswer == 2) //switch classes
				{
					ClassIsChanging();
				}
			
			
			else
				{
					System.out.println("That is not an option");
				}
			
		}
		
		public static void GradeIsChanging()
		{
			
		}
		
		public static void ClassIsChanging()
		{
			
		}
		
	}
