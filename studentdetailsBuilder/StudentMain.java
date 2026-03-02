
package studentdetailsBuilder;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("enter ID : ");
        int ID=obj.nextInt();
        obj.nextLine();
        System.out.println("enter name : ");
        String name=obj.nextLine();
        System.out.println("enter email : ");
        String email=obj.nextLine();
        System.out.println("enter phone no : ");
        long phone=obj.nextLong();
        obj.nextLine();
        System.out.println("enter address : ");
        String address=obj.nextLine();
        
        Student stu=new Student.StudentBuilder(ID, name).setEmail(email).setPhone(phone).setAddress(address).stu();
        stu.display();
    }
    
}
