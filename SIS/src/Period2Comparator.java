import java.util.Comparator;

public class Period2Comparator implements Comparator<Student>{

public int compare(Student s1, Student s2) {
		
		int periodCompare = s1.getPeriodTwo().compareToIgnoreCase(s2.getPeriodTwo());
		
		int lastNameCompare = s1.getLastName().compareToIgnoreCase(s2.getLastName());
		
		
		return (periodCompare == 0) ? lastNameCompare : periodCompare;
	}


}
