import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextReader {
	
	private static ArrayList<String[]> studentInfo = new ArrayList<String[]>();
	
	public static void runFileReader()
	{
		/// TODO: temporary String arraylist until we get an object
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(new File("StudentInfo.txt")));
			String line = br.readLine();
			
			while(line != null)
			{
				
				studentInfo.add(line.split(" "));
			}
	
		}
		catch(IOException e)
		{
			System.out.println("Whoops, an error occured reading the file.");
			//syso
		}
	}
	
	public static ArrayList<String[]> getInfo()
	{
		return studentInfo;
	}
}
