import java.util.ArrayList;
import java.util.List;

public class AddOrDeleteStudent {

    private static ArrayList<Student> studentList = TextReader.getStudentInfo();

    public static void addStudent(String firstName, String lastName, String[] classes ,String[] grades) {
        if (grades.length < 3) {
            System.out.println("Error: Not enough grade information provided.");
            MenuScreen.menuRunning();
            return;
        }
        else if (classes.length < 3) {
            System.out.println("Error: Not enough class information provided.");
            MenuScreen.menuRunning();
            return;
        }

        Student newStudent = new Student(firstName, lastName, classes[0], classes[1], classes[2], grades[0], grades[1], grades[2], 0);
        studentList.add(newStudent);
        System.out.println("Student " + firstName + " " + lastName + " has been added.");
        
        TextReader.setStudentInfo(studentList);
        MenuScreen.menuRunning();
        return;
    }

    public static void deleteStudent(String firstName, String lastName) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                studentList.remove(i);
                System.out.println("Student " + firstName + " " + lastName + " has been deleted.");
                TextReader.setStudentInfo(studentList);
                MenuScreen.menuRunning();
                return;
            }
        }
        
       
        
        System.out.println("Error: Student " + firstName + " " + lastName + " not found.");
        MenuScreen.menuRunning();
        return;
    }
}

