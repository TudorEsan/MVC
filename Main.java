public class Main {

    public static void main(String[] args) {
        StudentController controller = new StudentController();
        StudentView view = new StudentView(controller);
        view.printStudents();
        view.addView();
        view.updateView();
        view.deleteView();
    }
}

