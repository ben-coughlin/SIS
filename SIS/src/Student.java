
public class Student {
	private String firstName; 
	private String lastName;
	private String periodOne;
	private String p1Grade; 
	private String periodTwo;
	private String p2Grade;
	private String periodThree;
	private String p3Grade;
	


	public Student(String firstName, String lastName, String periodOne, String p1Grade, String periodTwo, String p2Grade, String periodThree, String p3Grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.periodOne = periodOne;
		this.p1Grade = p1Grade;
		this.periodTwo = periodTwo;
		this.p2Grade = p2Grade;
		this.periodThree = periodThree;
		this.p3Grade = p3Grade;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPeriodOne() {
		return periodOne;
	}


	public void setPeriodOne(String periodOne) {
		this.periodOne = periodOne;
	}


	public String getP1grade() {
		return p1Grade;
	}


	public void setP1grade(String p1grade) {
		this.p1Grade = p1grade;
	}


	public String getPeriodTwo() {
		return periodTwo;
	}


	public void setPeriodTwo(String periodTwo) {
		this.periodTwo = periodTwo;
	}


	public String getP2Grade() {
		return p2Grade;
	}


	public void setP2Grade(String p2Grade) {
		this.p2Grade = p2Grade;
	}


	public String getPeriodThree() {
		return periodThree;
	}


	public void setPeriodThree(String periodThree) {
		this.periodThree = periodThree;
	}


	public String getP3Grade() {
		return p3Grade;
	}


	public void setP3Grade(String p3Grade) {
		this.p3Grade = p3Grade;
	}


	
}
