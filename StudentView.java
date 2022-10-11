import java.util.Scanner;

public class StudentView {
    public StudentController controller;
    Scanner in = new Scanner(System.in);

    public StudentView(StudentController controller) {
        this.controller = controller;
    }

    public void printStudents() {
        System.out.println("Student Details: ");
        for (Student s : this.controller.getStudents()) {
            System.out.println(s);
        }
    }

    public void updateView() {
        Student old, newS;

        old = getStudentFromTerminal("Old Student");
        newS = getStudentFromTerminal("New Student");
        this.controller.updateStudent(old, newS);
        System.out.println("Student updated!");

        this.printStudents();

    }

    public void deleteView() {
        Student s = getStudentFromTerminal("Student to delete");
        this.controller.deleteStudent(s);
        System.out.println("Student deleted!");

        this.printStudents();
    }

    public void addView() {
        Student s = getStudentFromTerminal("Student to add");
        this.controller.addStudent(s);
        System.out.println("Student added!");

        this.printStudents();
    }

    public Student getStudentFromTerminal(String msg) {
        // get student from terminal
        System.out.println(msg);
        System.out.println("Enter student name: ");
        String name = in.nextLine();
        System.out.println("Enter student nr: ");
        int nr = in.nextInt();
        in.nextLine();
        return new Student(name, nr);
    }

}
