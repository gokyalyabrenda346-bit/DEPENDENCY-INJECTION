package dependencyinjection.students;
import org.springframework.stereotype.Component;
@Component
public class StudentInformation {
    private final StudentService Studentdetails;
// CONSTRUCTOR INJECTION
    public StudentInformation(StudentService studentdetails) {
        Studentdetails= studentdetails;
    }
    public void showstudents(){
        Studentdetails.displaystudent();
    }
}
