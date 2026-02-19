
package studentacademicdetails;

import java.util.Scanner;

public class StudentAcademicDetails {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String name=null;
        int rollNo=0;
        int subCount=0;
        Institution.Student inform=new Institution().new Student(name,rollNo,subCount);
        boolean exit =false;
        do
        {
            System.out.print("1. Add student\n2. Add mark\n3. Calculate grade\n4. Display student details\n5. exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            obj.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("enter student student name : ");
                    name=obj.nextLine();
                    System.out.println("enter roll no : ");
                    rollNo=obj.nextInt();
                    System.out.println("enter number of subjects : ");
                    subCount=obj.nextInt();
                    inform=new Institution().new Student(name,rollNo,subCount);
                    break;
                case 2 :
                    inform.enterMarks();
                    break;
                case 3:
                    inform.grade();
                    break;
                case 4:
                    inform.displayStudentDetails();
                    break;
                case 5:
                    System.out.println("Thank You");
                    exit=true;
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }while(!exit);
    }
    
}
