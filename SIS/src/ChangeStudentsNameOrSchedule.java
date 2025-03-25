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
			System.out.println();
			System.out.println("You have chosen to switch a students grade.");
			System.out.println("What student do you want to work with?");
			
			Scanner userInput = new Scanner (System.in);
			int studentChosen = userInput.nextInt();
			
		}
		
		public static void ClassIsChanging()
		{
			System.out.println();
			System.out.println("You have chosen to switch a student's class.");
			System.out.println("What student do you want to work with?");
			
			Scanner userInput = new Scanner (System.in);
			int studentChosen = userInput.nextInt();
			
		}
		
		public static void StudentIsPicked()
		{
			
		}
		
	}







