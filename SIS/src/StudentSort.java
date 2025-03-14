import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentSort {
	
	

	public static void sortSubmenu()
	{
		 Scanner scn = new Scanner(System.in);
		System.out.println("\nHow would you like to sort?");
		System.out.println("1.) Last Name");
		System.out.println("2.) GPA");
		System.out.println("3.) Period");
		System.out.println("4.) Return to Main Menu");

		if(scn.nextInt() == 1)
		{
			sortLastName();		
		}
		else if(scn.nextInt() == 2)
		{
			sortGPA();
		}
		else if(scn.nextInt() == 3)
		{
			sortPeriod();
		}
		else if(scn.nextInt() == 4)
		{
			MenuScreen.menuRunning();
		}
		else
		{
			System.out.println("what");
			sortSubmenu();
		}
	}	
	
	public static void sortLastName()
	{
		 Scanner scn = new Scanner(System.in);
		System.out.println("You are sorting by Last Name.");
		
		
		Collections.sort(TextReader.getStudentInfo(), new LastNameComparator());
		
	
		for(Student s : TextReader.getStudentInfo())
		{
			System.out.println(s.getLastName() + ", " + s.getFirstName());
		}
		
		System.out.println("Press 1 to sort a different way. \nPress 2 to return to the main menu.");
		
		if(scn.nextInt() == 1)
		{
			sortSubmenu();
		}
		else
		{
			MenuScreen.menuRunning();
		}
		
	}
	
	public static void sortGPA()
	{
		
	}
	
	public static void sortPeriod()
	{
		
	}
}
