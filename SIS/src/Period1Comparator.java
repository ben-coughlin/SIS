import java.util.Comparator;

public class Period1Comparator implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		
		int periodCompare = s1.getPeriodOne().compareToIgnoreCase(s2.getPeriodOne());
		
		int lastNameCompare = s1.getLastName().compareToIgnoreCase(s2.getLastName());
		
		
		return (periodCompare == 0) ? lastNameCompare : periodCompare;
	}
	

	
	
	
	

}
