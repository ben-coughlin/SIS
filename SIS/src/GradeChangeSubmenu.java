import java.util.Scanner;
import java.util.ArrayList;

public class GradeChangeSubmenu
	{

		public static void GradeIsChanging()
			{
				
				ArrayList <Student> gradeChanged = TextReader.getStudentInfo();
				Scanner userInput = new Scanner (System.in);
				
				
				System.out.println();
				System.out.println("You have chosen to switch a student's grade.");
				System.out.println("What student do you want to work with?");
				System.out.println();
				
				for(int i = 0; i < gradeChanged.size(); i++)
					{
						System.out.println(gradeChanged.get(i).getFirstName());
					}
				
				System.out.println();
				
				String studentChosen = userInput.nextLine();
				System.out.println("Alright! You chose to change " + studentChosen + "'s grade.");
				System.out.println("Finding student...");
				System.out.println();
				
				for(int i = 0; i < gradeChanged.size(); i++)
					{
						if(gradeChanged.get(i).getFirstName().equals(studentChosen))
							{
								System.out.println("Found!");
								
								
							}
					}
				

			}

	}
