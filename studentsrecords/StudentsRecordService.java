
package studentsrecords;

import java.sql.SQLException;

public class StudentsRecordService {
    void addStudentRecords(int rollNo,String name,short age,String dept) throws ClassNotFoundException, SQLException
    {
        StudentsRecordDAO sr=new StudentsRecordDAO();
        int result=sr.createStudentsRecords(rollNo, name, age, dept);
        if(result>0)
        {
            System.out.println("Records added successfull");
        }
        else
        {
            System.out.println("Please try again");
        }
    }
    void updateStudentRecords(int option,int rollNo,String name) throws ClassNotFoundException, SQLException
    {
        StudentsRecordDAO sr=new StudentsRecordDAO();
        int result=sr.updateStudentsRecords(option,rollNo, name);
        if(result>0)
        {
            System.out.println("Records updated successfull");
        }
        else
        {
            System.out.println("Please try again");
        }
    }
    void deleteStudentRecords(int rollNo) throws ClassNotFoundException, SQLException
    {
        StudentsRecordDAO sr=new StudentsRecordDAO();
        int result=sr.deleteStudentsRecords(rollNo);
        if(result>0)
        {
            System.out.println("Records deleted successfull");
        }
        else
        {
            System.out.println("Please try again");
        }
    }
    void display() throws ClassNotFoundException, SQLException
    {
        StudentsRecordDAO sr=new StudentsRecordDAO();
        sr.display();
    }
}
