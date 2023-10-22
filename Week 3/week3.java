public class week3 {

    public static void main(String[] args)  {
        CourseClass CompSci = new CourseClass("01-23", "CompSci");
        StudentClass Will = new StudentClass(1, "Will");

        CompSci.enrollStudent(Will);

    }


}
