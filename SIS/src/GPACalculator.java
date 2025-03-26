import java.text.DecimalFormat;

public class GPACalculator {
	
	public static String calculateGPA(Student s)
	{
		double rawGPA = 0.0;
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		for(int i = 0; i < 3; i++)
		{
			String grade = "";
			
			if(i == 0)
			{
				grade = s.getP1grade();
			}
			else if(i == 1)
			{
				grade = s.getP2Grade();
			}
			else if(i == 2)
			{
				grade = s.getP3Grade();
			}
			
			//System.out.println(rawGPA);
			
			switch(grade)
			{
			case "A+":
			case "A":
			
				{
				rawGPA += 4.0;
				break;
				}
			case "A-":
				{
				rawGPA += 3.7;
				break;
				}
			case "B+":
				{
				rawGPA += 3.3;
				break;
				}
			case "B":
				{
				rawGPA += 3.0;
				break;
				}
			case "B-":
				{
				rawGPA += 2.7;
				break;
				}
			case "C+":
				{
				rawGPA += 2.3;
				break;
				}
			case "C":
				{
				rawGPA += 2.0;
				break;
				}
			case "C-":
				{
				rawGPA += 1.7;
				break;
				}
			case "D+":
				{
				rawGPA += 1.3;
				break;
				}
			case "D":
				{
				rawGPA += 1.0;
				break;
				}
			default:
				{
				rawGPA += 0.0;	
				break;
				}
				
				
			
			}
		}
		
		return df.format(rawGPA /= 3);
		
		
	}
	
	
}
