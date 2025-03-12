import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextReader {
	
	
	public static void runFileReader()
	{
		/// TODO: temporary String arraylist until we get an object
		ArrayList<String[]> studentInfo = new ArrayList<String[]>();
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(new File("StudentInfo.txt")));
			String line = br.readLine();
			
			while(line != null)
			{
				
				studentInfo.add(line.split(" "));
			}
	//e
		}
		catch(IOException e)
		{
			System.out.println("Whoops, an error occured reading the file.");
		}
	}
}
