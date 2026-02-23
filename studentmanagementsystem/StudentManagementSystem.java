
package studentmanagementsystem;

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        StudentDetails student=new StudentDetails();
        boolean exit=false;
        do
        {
            System.out.println("1. Add Student\n2. Remove Student\n3. Search Student\n4. Display All Student\n5. Display Total Student Count\n6. exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            obj.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("enter Student ID : ");
                    int ID=obj.nextInt();
                    obj.nextLine();
                    System.out.println("enter student name : ");
                    String name=obj.nextLine();
                    student.addStusent(ID, name);
                    break;
                case 2:
                    System.out.println("enter Student ID for remove : ");
                    int Id=obj.nextInt();
                    student.remove(Id);
                    break;
                case 3:
                    System.out.println("enter Student ID for search : ");
                    int IDs=obj.nextInt();
                    student.search(IDs);
                    break;
                case 4:
                    student.display();
                    break;
                case 5:
                    student.studentCount();
                    break;
                case 6:
                    System.out.println("Thank You");
                    exit=true;
                    break;
                default : 
                    System.out.println("invalid choice");
            }
        }while(!exit);
    }
    
}
