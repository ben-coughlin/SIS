import java.util.Comparator;

public class Period3Comparator implements Comparator<Student>{
	
	public int compare(Student s1, Student s2) {
		
		int periodCompare = s1.getPeriodThree().compareToIgnoreCase(s2.getPeriodThree());
		
		int lastNameCompare = s1.getLastName().compareToIgnoreCase(s2.getLastName());
		
		
		return (periodCompare == 0) ? lastNameCompare : periodCompare;
	}
}
