
package studentmanagementsystem;

public class Students {
   private String studentName;
   private int ID;
   static int studentCount;

    public Students(String studentName, int ID) {
        this.studentName = studentName;
        this.ID = ID;
        studentCount++;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getID() {
        return ID;
    }
    
}
