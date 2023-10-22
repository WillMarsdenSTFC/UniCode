public class CourseClass {
    private String courseCode, courseName;
    private StudentClass courseStudent;

    public CourseClass(String Code, String Name) {
        courseCode = Code;
        courseName = Name;
    }

    public void enrollStudent(StudentClass Student) {
        courseStudent = Student;
        System.out.println(Student.getName() + " with the ID: " + Student.getID() + " was enrolled to " + courseName + " with the code: " + courseCode);
    }
}
