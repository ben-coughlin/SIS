import java.util.Scanner;
import java.util.ArrayList;

public class ScheduleChangeSubmenu
	{

		public static void ScheduleIsChanging()
			{
				
				ArrayList <Student> scheduleChanged = TextReader.getStudentInfo();
				Scanner userInput = new Scanner (System.in);
				
				
				System.out.println();
				System.out.println("You have chosen to switch a student's class.");
				System.out.println("What student do you want to work with?");
				System.out.println();
				
				for(int i = 0; i < scheduleChanged.size(); i++)
					{
						System.out.println(scheduleChanged.get(i).getFirstName());
					}
				
				System.out.println();
				
				String studentChosen = userInput.nextLine();
				System.out.println("Alright! You chose to change " + studentChosen + "'s class.");
				System.out.println("Finding student...");
				System.out.println();
				
				for(int i = 0; i < scheduleChanged.size(); i++)
					{
						if(scheduleChanged.get(i).getFirstName().equals(studentChosen))
							{
								System.out.println("Found!");
								
								
							}
					}
				

			}

	}






















