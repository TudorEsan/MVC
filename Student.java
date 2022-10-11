public class Student {
    public static int id = 0;
    public int nr;
    public String fullName;
    public int studentId;

    Student(String fullName, int nr) {
        this.studentId = ++id;
        this.nr = nr;
        this.fullName = fullName;
    }

    public String toString() {
       return String.format("Student: id: %d, nr: %d, full name: %s", this.studentId, this.nr, this.fullName);
    }

    // equality is based on studentId
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;

        }
        Student s = (Student) o;
        return s.nr == this.nr;
    }
}
