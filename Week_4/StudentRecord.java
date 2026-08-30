public class StudentRecord {

    private int marks;
    private String name;
    private String studentID;

    public StudentRecord(String name, String studentID, int marks) {

        if (name == null || studentID == null) {
            throw new IllegalArgumentException("Name or Student ID cannot be null");
        }

        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }

        this.name = name;
        this.studentID = studentID;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setStudentID(String studentID) {
        if (studentID != null) {
            this.studentID = studentID;
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID
                + ", Name: " + name
                + ", Marks: " + marks;
    }

    public static void main(String[] args) {

        StudentRecord student =
                new StudentRecord("Sandip", "25csu215", 99);

        student.setMarks(40);

        System.out.println(student);
    }
}
