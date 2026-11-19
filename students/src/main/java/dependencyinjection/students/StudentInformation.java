package dependencyinjection.students;

public class StudentInformation {
    private final StudentService Studentdetails;
// CONSTRUCTOR INJECTION
    public StudentInformation(StudentService studentdetails) {
        Studentdetails= studentdetails;
    }
    public void showstudent(){
        Studentdetails.displaystudent();
    }
}
