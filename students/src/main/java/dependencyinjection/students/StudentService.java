package dependencyinjection.students;
import org.springframework.stereotype.Component;
@Component
public class StudentService {
    public void displaystudent(){
        System.out.println("Student Name:Mirembe");
        System.out.println("Course:BIT");
    }
}
