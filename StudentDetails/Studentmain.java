package StudentDetails;
import java.util.Scanner;
public class Studentmain {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter student name : ");
        String name=obj.nextLine();
        System.out.print("enter student ID : ");
        int ID=obj.nextInt();
        obj.nextLine();
        Student s1=new Student(ID,name);
        System.out.print("enter course name : ");
        String courseName=obj.nextLine();
        JavaCourse course=new JavaCourse(courseName);
        
        System.out.println("------ Student Detail ------");
        course.joinCourse(s1);
    }
 
}
