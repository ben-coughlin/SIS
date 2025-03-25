import java.util.Scanner;
import java.util.ArrayList;

public class ScheduleChangeSubmenu
	{

		public static void ScheduleIsChanging()
			{
				
				ArrayList<Student> scheduleChanged = TextReader.getStudentInfo();
				
				System.out.println();
				System.out.println("You have chosen to switch a student's class.");
				System.out.println("What student do you want to work with?");
				
				Scanner userInput = new Scanner (System.in);
				int studentChosen = userInput.nextInt();

			}

	}
