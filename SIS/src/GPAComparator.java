import java.util.Comparator;

public class GPAComparator implements Comparator<Student>{

	
	public int compare(Student s1, Student s2) {
		
		return GPACalculator.calculateGPA(s2).compareTo(GPACalculator.calculateGPA(s1));
	}
	
	

}
