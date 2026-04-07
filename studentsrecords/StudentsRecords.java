
package studentsrecords;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentsRecords {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       /* int rollNo=174;
        String name="Sumaiya";
        short age=20;
        String dept="IT";
        StudentsRecordService ss=new StudentsRecordService();
        ss.addStudentRecords(rollNo, name, age, dept);*/
       Scanner obj=new Scanner(System.in);
       StudentsRecordService ss=new StudentsRecordService();
       boolean exit=false;
       do
       {
           System.out.print("1. Insert\n2. Display\n3. Update\n4. Delete\n5. Exit\n");
           System.out.print("enter your choice : ");
           int choice=obj.nextInt();
           switch(choice)
           {
               case 1:
                   System.out.print("enter roll number : ");
                   int rollNo=obj.nextInt();
                   obj.nextLine();
                   System.out.print("enter name : ");
                   String name=obj.nextLine();
                   System.out.print("enter age : ");
                   short age=obj.nextShort();
                   obj.nextLine();
                   System.out.print("enter department name : ");
                   String dept=obj.nextLine();
                   ss.addStudentRecords(rollNo, name, age, dept);
                   break;
                case 2:
                   ss.display();
                   break;
                case 3:
                   System.out.print("enter roll number : ");
                   int rollNum=obj.nextInt();
                   System.out.print("1. Update Name\n2. Update age\n3. Update Department\n");
                   int option=obj.nextInt();
                   obj.nextLine();
                   System.out.print("enter value : ");
                   String value=obj.nextLine();
                   ss.updateStudentRecords(option,rollNum, value);
                   break;
                case 4:
                   System.out.print("enter roll number : ");
                   int rollNumber=obj.nextInt();
                   obj.nextLine();
                   ss.deleteStudentRecords(rollNumber);
                   break;
                case 5:
                    exit=true;
                    System.out.println("Thank You");
                    break;
                default :
                    System.out.println("Inavlid choice");
                   
           }
       }while(!exit);
    }
    
}
