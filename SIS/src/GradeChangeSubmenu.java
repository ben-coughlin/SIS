import java.util.Scanner;
import java.util.ArrayList;

public class GradeChangeSubmenu
	{

		public static void GradeIsChanging()
			{
				
				ArrayList<Student> gradeChanged = TextReader.getStudentInfo();
				
				Scanner userInput = new Scanner (System.in);
				
				System.out.println();
				System.out.println("You have chosen to switch a students grade.");
				System.out.println("What student do you want to work with?");
				
				
				int studentChosen = userInput.nextInt();

			}

	}
