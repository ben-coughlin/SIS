import java.util.Scanner;

public class SortStudentsSubmenu {
	
	public static void sortStudents()
	{
		Scanner scn = new Scanner(System.in);
		
		TextReader.runFileReader();
		
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println("1. Sort by Last Name");
		System.out.println("2. Sort by GPA");
		System.out.println("3. Sort by Period");
		System.out.println("4. Go Back");
		System.out.println();		
		int choice = scn.nextInt();
		
		if(choice == 1)
		{
			LastNameSorter.runLastNameSort();
		}
		else if(choice == 2)
		{
			//gpa
		}
		else if(choice == 3)
		{
			//period
		}
		else if(choice == 4)
		{
			MenuScreen.menuRunning();
		}
		else
		{
			System.out.println("what");
			sortStudents();
		}
			
	}
}
