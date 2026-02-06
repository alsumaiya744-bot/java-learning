package StudentDetails;
public class JavaCourse extends Course {
    
    public JavaCourse(String courseName) {
        super(courseName);
    }

    @Override
    void joinCourse(Student student) {
        System.out.println("Student Name : "+student.getName());
        System.out.println("Student ID : "+student.getID());
        System.out.println("Course Name : "+super.courseName);
    }
    
    
}
