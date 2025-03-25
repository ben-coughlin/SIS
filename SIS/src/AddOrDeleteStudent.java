import java.util.ArrayList;
import java.util.List;

public class AddOrDeleteStudent {

    private List<Student> studentList = new ArrayList<>();

    public void addStudent(String firstName, String lastName, String[] grades) {
      
    
        Student newStudent = new Student(firstName, lastName, grades[0], grades[1], grades[2], lastName, lastName, lastName);
        

        studentList.add(newStudent);
        System.out.println("Student " + firstName + " " + lastName + " has been added.");
    }


    public void deleteStudent(String firstName, String lastName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                studentList.remove(student);
                System.out.println("Student " + firstName + " " + lastName + " has been deleted.");
        
            }
        }
     
    }
}
