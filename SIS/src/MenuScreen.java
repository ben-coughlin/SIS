import java.util.Scanner;

public class MenuScreen
	{

		public static void menuRunning()
		{
			
			
			TextReader.runFileReader();
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("1. Add or delete a student");
			System.out.println("2. Change student grades/schedule");
			System.out.println("3. Sort students");
			System.out.println();
		
			Scanner userInput = new Scanner (System.in);
			int answer = userInput.nextInt();
		
			if(answer == 1)
				{
					//This will take the user to the class that adds or deletes a student
				
				}
		
			else if(answer == 2)
				{
					//This will take the user to the class that changes a students grades/schedule
				
					ChangeStudentsNameOrSchedule.StudentIsChanging();
				}
		
			else if(answer == 3)
				{
					//This will take the user to the class that sorts the students
					StudentSort.sortSubmenu();
				}
		
			else
				{
					System.out.println("That is not an option");
				}

		}
	}
