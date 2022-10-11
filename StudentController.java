import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students;

    public StudentController() {
        this.students = new ArrayList<Student>();
        this.students.add(new Student("John Doe", 1));
        this.students.add(new Student("Jane Doe", 2));
        this.students.add(new Student("John Smith", 3));
        this.students.add(new Student("Jane Smith", 4));
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student s) {
        this.students.add(s);
    }

    public void updateStudent(Student old, Student newS) {
        this.students.set(this.students.indexOf(old), newS);
    }

    public void deleteStudent(Student s) {
        this.students.remove(s);
    }
}
